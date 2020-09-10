package com.hongyou.sms.sdk.request;

import com.hongyou.sms.sdk.common.HongyouRequest;
import com.hongyou.sms.sdk.response.UserInfoResponse;

public class UserInfoRequest extends HongyouRequest<UserInfoResponse> {

    @Override
    public String getApiUrlPath() {
        return "/user/info";
    }

    @Override
    public Class<UserInfoResponse> getResponseClass() {
        return UserInfoResponse.class;
    }
}
