package com.geewise.bigdata.controller;

import com.geewise.bigdata.entity.Order;
import com.geewise.bigdata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 *
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{skuId}")
    public BigDecimal getAmountBySkuId(
            @PathVariable(name = "skuId", required = true) String skuId
    ){
        return orderService.getTotalAmountBySkuId(skuId);
    }

    @GetMapping("/detail/{id}")
    public List<Order> getOderBySkuId(
            @PathVariable(name = "id", required = true) Integer id
    ){
        return orderService.getOrderById(id);
    }

    @PostMapping("/save")
    public Order save(@RequestBody Order order
    ){
        orderService.insert(order);
        return order;
    }
}
