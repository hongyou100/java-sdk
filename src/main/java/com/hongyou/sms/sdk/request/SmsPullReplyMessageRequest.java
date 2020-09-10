package com.hongyou.sms.sdk.request;

import com.hongyou.sms.sdk.common.HongyouRequest;
import com.hongyou.sms.sdk.response.SmsPullReplyMessageResponse;

public class SmsPullReplyMessageRequest extends HongyouRequest<SmsPullReplyMessageResponse> {

    @Override
    public String getApiUrlPath() {
        return "/sms/pullReply";
    }

    @Override
    public Class<SmsPullReplyMessageResponse> getResponseClass() {
        return SmsPullReplyMessageResponse.class;
    }
}
