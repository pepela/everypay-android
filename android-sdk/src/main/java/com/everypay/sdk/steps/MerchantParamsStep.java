package com.everypay.sdk.steps;

import com.everypay.sdk.EveryPay1;
import com.everypay.sdk.api.merchant.MerchantApi;
import com.everypay.sdk.api.merchant.MerchantParamsRequestData;
import com.everypay.sdk.api.merchant.MerchantParamsResponseData;

public class MerchantParamsStep extends Step {

    @Override
    public final StepType getType() {
        return StepType.MERCHANT_PARAMS;
    }

    public MerchantParamsResponseData run(EveryPay1 ep, String deviceInfo) {
        return  MerchantApi.getMerchantApi(ep.getMerchantUrl()).callGetParams(new MerchantParamsRequestData(deviceInfo));
    }
}
