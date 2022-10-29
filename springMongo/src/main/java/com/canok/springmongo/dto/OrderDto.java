package com.canok.springmongo.dto;

import com.canok.springmongo.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private String name;
    private String userId;

    public Order convertToOrder(){
        return Order.builder().userId(this.userId).orderName(this.name).orderTime(LocalDateTime.now()).build();
    }
}
