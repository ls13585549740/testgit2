package com.funong.newerp.common.enums;

import lombok.Getter;
import lombok.Setter;

public enum ResponseCodeEnum {
    SUCCESS(200, "SUCCESS"),
    EXCEPTION(999, "EXCEPTION");


    //参数错误，100
    //Exception,900
    //用户相关，300
    //订单相关，500
    //合同相关，600
    //提货相关,700
    //支付相关,800
    @Getter
    @Setter
    int value;
    @Getter
    @Setter
    String msg;

    ResponseCodeEnum(int value, String msg) {
        this.value = value;
        this.msg = msg;
    }
}
