package com.hongyou.sms.sdk.request;

import com.hongyou.sms.sdk.common.HongyouRequest;
import com.hongyou.sms.sdk.response.SmsPullStatusReportResponse;

public class SmsPullStatusReportRequest extends HongyouRequest<SmsPullStatusReportResponse> {

    @Override
    public String getApiUrlPath() {
        return "/sms/pullStatusReport";
    }

    @Override
    public Class<SmsPullStatusReportResponse> getResponseClass() {
        return SmsPullStatusReportResponse.class;
    }
}
