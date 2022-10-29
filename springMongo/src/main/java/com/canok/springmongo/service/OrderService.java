package com.canok.springmongo.service;

import com.canok.springmongo.entity.Order;
import com.canok.springmongo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void saveOrder(Order order){
        orderRepository.save(order);
    }

    @Override
    public List<Order> ordersOfUser(String userId){
        return orderRepository.findByUserId(userId);
    }
}
