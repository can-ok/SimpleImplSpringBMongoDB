package com.canok.springmongo.dto;


import com.canok.springmongo.entity.Address;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
public class AddressDto {
    private String city;
    private Integer postCode;

    public Address convertToAddress(){
        return Address.builder().city(city).postCode(postCode).build();
    }
}
