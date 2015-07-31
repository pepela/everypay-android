package com.everypay.sdk.api.merchant;

import com.everypay.sdk.api.EverypayTokenResponseData;

public class MerchantPaymentRequestData {
    public String hmac;
    public String singleCcToken;

    public MerchantPaymentRequestData(MerchantParamsResponseData paramsResponse, EverypayTokenResponseData everypayResponse) {
        this.hmac = paramsResponse.hmac;
        this.singleCcToken = everypayResponse.getToken();
    }
}
