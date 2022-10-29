package com.canok.springmongo.dto;


import com.canok.springmongo.entity.Gender;
import com.canok.springmongo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {

    private String name;
    private String country;
    private String username;
    private AddressDto addressDto;
    private Gender gender;

    public User convertToUser(){
        return User.builder().gender(gender).userName(this.username).name(this.name).address(this.addressDto==null?null:addressDto.convertToAddress()).country(country).build();
    }

}
