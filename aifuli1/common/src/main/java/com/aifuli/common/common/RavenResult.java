package com.aifuli.common.common;


import java.util.HashMap;
import java.util.Optional;

public class RavenResult {

    private Integer code;

    private String msg;

    private Object data;

    public RavenResult() {
    }

    public RavenResult(Object data) {
        this.code = CommonCodeConstants.SUCCESS_CODE;
        this.msg = MessageSourceConstants.SUCCESS;
        this.data = data;
    }

    public RavenResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * code 10000
     * msg "Success"
     *
     * @param data
     * @return
     */
    public static RavenResult ok(Object data) {
        return new RavenResult(data);
    }

    public static RavenResult ok() {
        return new RavenResult(10000, MessageSourceConstants.SUCCESS, true);
    }

    /**
     * code 10001
     * data null
     *
     * @param msg
     * @return
     */
    public static RavenResult error(String msg) {
        return new RavenResult(CommonCodeConstants.ERROR_CODE, msg, false);
    }

    /**
     * code 11001
     * 登录失败(帐号或密码错误)
     */
    public static RavenResult loginFailure(String msg) {
        return new RavenResult(CommonCodeConstants.LOGIN_FAILURE_CODE, msg, false);
    }

    /**
     * code 11002
     * 凭证失效(登录时效已过，或未登录)
     */
    public static RavenResult certificateInvalidation(String msg) {
        return new RavenResult(CommonCodeConstants.CERTIFICATE_INVALIDATION_CODE, msg, false);
    }

    /**
     * code 11002
     * 凭证失效(登录时效已过，或未登录)
     */
    public static RavenResult certificateInvalidation() {
        return new RavenResult(CommonCodeConstants.CERTIFICATE_INVALIDATION_CODE, "登录时效已过，或未登录", false);
    }

    /**
     * code 11003
     * 权限不足
     */
    public static RavenResult noPermission(String msg) {
        return new RavenResult(CommonCodeConstants.NO_PERMISSION_CODE, msg, false);
    }

    /**
     * code 11003
     * 权限不足
     */
    public static RavenResult noPermission() {
        return new RavenResult(CommonCodeConstants.NO_PERMISSION_CODE, "权限不足", false);
    }

    /**
     * @param code
     * @param msg
     * @param data
     * @return
     */
    public static RavenResult build(Integer code, String msg, Object data) {
        return new RavenResult(code, msg, data);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        Optional<Object> optional = Optional.ofNullable(this.data);
        Object obj = optional.orElse(new HashMap<>());
        return obj;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RavenReult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
