package com.aifuli.common.config;


import ch.qos.logback.classic.net.SMTPAppender;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.helpers.CyclicBuffer;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.springframework.util.DigestUtils;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class MySMTPAppender<E> extends SMTPAppender {

    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    LoadingCache<String, String> messageCache = CacheBuilder
            .newBuilder()
            .expireAfterAccess(5, TimeUnit.MINUTES)
            .build(new CacheLoader<String, String>() {
                @Override
                public String load(String md5) throws Exception {
                    return "";
                }
            });

    @Override
    protected void sendBuffer(CyclicBuffer<ILoggingEvent> cb, ILoggingEvent lastEventObject) {
        if (enable){
            if (mailJudgement(lastEventObject)) {
                super.sendBuffer(cb, lastEventObject);
            }
        }

    }


    /**
     * 对邮件的message信息做md5加密后比对内存
     * 如果五分钟内有比对上的值，则不再重复发送邮件
     *
     * @param event
     * @return
     */
    private boolean mailJudgement(ILoggingEvent event) {
        String level = event.getLevel().toString();
        String loggerName = event.getLoggerName();
        String methodName = "";
        String lineNumber = "";
        StackTraceElement info = null;
        StackTraceElement[] traceElement = event.getCallerData();
        if (traceElement != null && traceElement.length > 0) {
            info = traceElement[0];
        }

        if (info != null) {
            methodName = info.getMethodName();
            lineNumber = String.valueOf(info.getLineNumber());
        }

        StringBuilder ele = new StringBuilder(128);
        for (StackTraceElement element : traceElement) {
            ele.append(element);
        }
        String eleTrace = ele.toString();
        String formattedMessage = event.getFormattedMessage();
        String message = level + loggerName + methodName + lineNumber + formattedMessage + eleTrace;
        String md5Key = DigestUtils.md5DigestAsHex(message.getBytes());
        try {
            String md5Value = messageCache.get(md5Key);
            //如果缓存里已经有信息 则五分钟内不发邮件
            if (md5Value.equals("")) {
                messageCache.put(md5Key, md5Key);
                return true;
            } else if (md5Key.equals(md5Value)) {
                return false;
            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return true;
    }


}
