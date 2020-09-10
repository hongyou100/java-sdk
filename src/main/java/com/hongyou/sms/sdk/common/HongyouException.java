package com.hongyou.sms.sdk.common;


public class HongyouException extends RuntimeException {

    public HongyouException(String message) {
        super(message);
    }

    public HongyouException(String message, Throwable cause) {
        super(message, cause);
    }

    public HongyouException(Throwable cause) {
        super(cause);
    }

}
