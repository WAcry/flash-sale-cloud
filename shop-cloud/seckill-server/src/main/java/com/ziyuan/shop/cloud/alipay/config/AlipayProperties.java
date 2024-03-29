package com.ziyuan.shop.cloud.alipay.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Leon
 * @date 2020/8/23
 */
@Getter
@Setter
@Component
@ConfigurationProperties(
        prefix = "alipay"
)
public class AlipayProperties {

    private String appId;
    private String merchantPrivateKey;
    private String alipayPublicKey;
    private String notifyUrl;
    private String returnUrl;
    private String signType;
    private String charset;
    private String gatewayUrl;
}
