package com.canok.springmongo.service;


import com.canok.springmongo.entity.User;
import com.canok.springmongo.projection.CountryAggregation;
import com.canok.springmongo.projection.UserAggregation;
import com.canok.springmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user){
        userRepository.save(user);
    }

    @Override
    public List<User> findUserByCountry(String country){
        return userRepository.findByCountryAsCustom(country);
    }

    @Override
    public List<UserAggregation> groupByCountry(){

        return userRepository.groupByCountry();
    }

    @Override
    public List<CountryAggregation> countByCountry(){
        return userRepository.countByCountry();
    }

}
