package com.aifuli.common.config;


import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.core.LayoutBase;

import java.text.SimpleDateFormat;
import java.util.Objects;

public class MailLayout extends LayoutBase<ILoggingEvent> {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public String doLayout(ILoggingEvent event) {
        StringBuffer sbuf = new StringBuffer(128);

        if (!Objects.equals("ERROR", event.getLevel().toString())) {
            return "";
        }

        StackTraceElement info = null;
        IThrowableProxy throwableProxy = event.getThrowableProxy();
        StackTraceElementProxy[] elementProxies = throwableProxy.getStackTraceElementProxyArray();
        String cause = throwableProxy.getMessage();
        StackTraceElement[] traceElement = event.getCallerData();
        if (traceElement != null && traceElement.length > 0) {
            info = traceElement[0];
        }
        sbuf.setLength(0);
        sbuf.append("错误等级：" + event.getLevel().toString() + "<br>");
        sbuf.append("线程名称：" + event.getThreadName() + "<br>");
        sbuf.append("错误的类：" + event.getLoggerName() + "<br>");
        if (info != null) {
            sbuf.append("错误方法：" + info.getMethodName() + "<br>");
            sbuf.append("错误位置：" + info.getLineNumber() + " 行" + "<br>");
        }
        sbuf.append("错误时间：" + simpleDateFormat.format(event.getTimeStamp()) + "<br>");

        sbuf.append("错误原因：" +event.getFormattedMessage()+","+ cause + "<br>");
        StringBuilder ele = new StringBuilder(128);
        for (StackTraceElementProxy element : elementProxies) {
            ele.append(element + "<br>");
        }

        sbuf.append("错误堆栈信息：" + ele.toString() + "<br>");

        String result = sbuf.toString();
        return result;
    }

    @Override
    public String getContentType() {
        return "text/html;charset=utf-8";
    }
}
