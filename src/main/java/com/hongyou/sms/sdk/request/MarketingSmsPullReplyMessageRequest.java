package com.hongyou.sms.sdk.request;

import com.hongyou.sms.sdk.common.HongyouRequest;
import com.hongyou.sms.sdk.response.SmsPullMarketingReplyMessageResponse;

public class MarketingSmsPullReplyMessageRequest extends HongyouRequest<SmsPullMarketingReplyMessageResponse> {

    @Override
    public String getApiUrlPath() {
        return "/sms/marketing/pullReply";
    }

    @Override
    public Class<SmsPullMarketingReplyMessageResponse> getResponseClass() {
        return SmsPullMarketingReplyMessageResponse.class;
    }

}
