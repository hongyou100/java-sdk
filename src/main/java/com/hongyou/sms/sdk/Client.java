package com.hongyou.sms.sdk;

import com.hongyou.sms.sdk.domain.*;

import java.util.List;


public interface Client {

    List<SmsBatchSubmitResult> smsBatchSubmit(List<SmsSubmit> submits);

    List<SmsStatusReport> smsPullStatusReport();

    List<SmsReplyMessage> smsPullReplyMessage();

    MarketingSmsBatchResult marketingSmsSubmit(String message, String sendTime, List<String> mobiles);

    List<MarketingSmsStatusReport> marketingSmsPullStatusReport();

    List<SmsReplyMessage> marketingSmsPullReplyMessage();

    UserInfo userInfo();

    String smsTest();

}
