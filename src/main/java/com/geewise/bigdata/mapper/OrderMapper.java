package com.geewise.bigdata.mapper;

import com.geewise.bigdata.entity.Order;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 *
 */
public interface OrderMapper {
    BigDecimal selectTotalAmountSkuId(String skuId);
    List<Order> selectOrder(Integer Id);
    int insert(Order order);
}
