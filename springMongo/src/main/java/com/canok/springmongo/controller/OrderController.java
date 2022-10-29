package com.canok.springmongo.controller;


import com.canok.springmongo.dto.OrderDto;
import com.canok.springmongo.service.IOrderService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @PostMapping
    public ResponseEntity<?> saveOrder(@RequestBody OrderDto orderDto){
        orderService.saveOrder(orderDto.convertToOrder());
        return ResponseEntity.ok(true);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getOrdersOfUser(@PathVariable String userId){
        return ResponseEntity.ok(orderService.ordersOfUser(userId));
    }
}
