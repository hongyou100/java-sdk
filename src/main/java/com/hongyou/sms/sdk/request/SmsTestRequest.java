package com.hongyou.sms.sdk.request;

import com.hongyou.sms.sdk.common.HongyouRequest;
import com.hongyou.sms.sdk.response.SmsTestResponse;

public class SmsTestRequest extends HongyouRequest<SmsTestResponse> {
    public String getApiUrlPath() {
        return "/sms/test";
    }

    public Class<SmsTestResponse> getResponseClass() {
        return SmsTestResponse.class;
    }
}
