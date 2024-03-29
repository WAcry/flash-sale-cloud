package com.ziyuan.shop.cloud.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
public class OrderInfo implements Serializable {

    public static final Integer STATUS_ARREARAGE = 0;
    public static final Integer STATUS_ACCOUNT_PAID = 1;
    public static final Integer STATUS_CANCEL = 2;
    public static final Integer STATUS_TIMEOUT = 3

    private String orderNo;
    private Long userId;
    private Long goodId;
    private Long deliveryAddrId;
    private String goodName;
    private String goodImg;
    private Integer goodCount;
    private BigDecimal goodPrice;
    private BigDecimal seckillPrice;
    private Integer status = STATUS_ARREARAGE;
    private Date createDate;
    private Date payDate;
}
