package com.canok.springmongo.service;

import com.canok.springmongo.entity.Order;

import java.util.List;

public interface IOrderService {
    void saveOrder(Order order);

    List<Order> ordersOfUser(String userId);
}
