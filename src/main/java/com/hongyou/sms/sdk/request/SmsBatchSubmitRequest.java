package com.hongyou.sms.sdk.request;

import com.hongyou.sms.sdk.common.HongyouRequest;
import com.hongyou.sms.sdk.domain.SmsSubmit;
import com.hongyou.sms.sdk.response.SmsBatchSubmitResponse;

import java.util.List;

public class SmsBatchSubmitRequest extends HongyouRequest<SmsBatchSubmitResponse> {

    private List<SmsSubmit> submits;

    public List<SmsSubmit> getSubmits() {
        return submits;
    }

    public void setSubmits(List<SmsSubmit> submits) {
        this.submits = submits;
    }

    @Override
    public String getApiUrlPath() {
        return "/sms/batchSubmit";
    }

    @Override
    public Class<SmsBatchSubmitResponse> getResponseClass() {
        return SmsBatchSubmitResponse.class;
    }
}
