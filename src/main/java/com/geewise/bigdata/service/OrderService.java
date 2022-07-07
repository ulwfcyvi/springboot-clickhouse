package com.geewise.bigdata.service;

import com.geewise.bigdata.entity.Order;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 *
 */
public interface OrderService {
    BigDecimal getTotalAmountBySkuId(String skuId);
    List<Order> getOrderById(Integer id);
    int insert(Order order);
}
