package com.hongyou.sms.sdk;

import com.hongyou.sms.sdk.common.HongyouApiException;
import com.hongyou.sms.sdk.domain.SmsSubmit;
import org.junit.Test;

import java.util.Arrays;

public class ClientTest {

    private static final String serverUrl = "https://api.hongyou100.com/api";
    private static final String apikey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";// 修改为您的apikey
    private static final Client client = new DefaultClient(serverUrl, apikey);

    @Test
    public void testSmsBatchSubmit() {
        try {
            client.smsBatchSubmit(Arrays.asList(
                    new SmsSubmit("187xxxxxxxx", "【弘友云通讯】您的验证码是：1234"),//修改为你要发送的手机号和短信内容
                    new SmsSubmit("186xxxxxxxx", "【弘友云通讯】您的验证码是：5678")//修改为你要发送的手机号和短信内容
            ));
        } catch (HongyouApiException e) {
            System.out.println("HongyouApiException, code: " + e.getCode() + ", message: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSmsPullStatusReport() {
        try {
            client.smsPullStatusReport();
        } catch (HongyouApiException e) {
            System.out.println("HongyouApiException, code: " + e.getCode() + ", message: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSmsPullReplyMessage() {
        try {
            client.smsPullReplyMessage();
        } catch (HongyouApiException e) {
            System.out.println("HongyouApiException, code: " + e.getCode() + ", message: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
