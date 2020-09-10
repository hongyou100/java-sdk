package com.hongyou.sms.sdk.common;

public class HongyouApiException extends HongyouException {

    private int code;

    public HongyouApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
