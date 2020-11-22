package com.ssl.common.exception;

/**
 * 功能描述：
 *
 * @Date: 2020/11/4 22:59
 */
public class CustomGenericException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private int errCode;
    private String errMsg;

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public CustomGenericException(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }
}
