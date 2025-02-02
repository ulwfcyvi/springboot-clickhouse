package com.geewise.bigdata.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 *
 */
@Data
public class Order {
    private Integer id;
    private String skuId;
    private BigDecimal totalAmount;
    private String createTime;
}
