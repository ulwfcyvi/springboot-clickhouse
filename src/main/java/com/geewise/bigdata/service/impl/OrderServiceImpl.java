package com.geewise.bigdata.service.impl;

import com.geewise.bigdata.entity.Order;
import com.geewise.bigdata.mapper.OrderMapper;
import com.geewise.bigdata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public BigDecimal getTotalAmountBySkuId(String skuId) {
        return orderMapper.selectTotalAmountSkuId(skuId);
    }

    @Override
    public List<Order> getOrderById(Integer id) {
        return orderMapper.selectOrder(id);
    }

    @Override
    public int insert(Order order) {
        return orderMapper.insert(order);
    }
}
