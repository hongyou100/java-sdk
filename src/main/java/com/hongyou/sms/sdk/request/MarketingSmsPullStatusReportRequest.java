package com.hongyou.sms.sdk.request;

import com.hongyou.sms.sdk.common.HongyouRequest;
import com.hongyou.sms.sdk.response.MarketingSmsPullStatusReportResponse;

public class MarketingSmsPullStatusReportRequest extends HongyouRequest<MarketingSmsPullStatusReportResponse> {

    @Override
    public String getApiUrlPath() {
        return "/sms/marketing/pullStatusReport";
    }

    @Override
    public Class<MarketingSmsPullStatusReportResponse> getResponseClass() {
        return MarketingSmsPullStatusReportResponse.class;
    }

}
