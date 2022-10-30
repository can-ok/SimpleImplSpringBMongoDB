package com.canok.springmongo.service;

import com.canok.springmongo.entity.User;
import com.canok.springmongo.projection.CountryAggregation;
import com.canok.springmongo.projection.UserAggregation;

import java.util.List;

public interface IUserService {
    void saveUser(User user);

    List<User> findUserByCountry(String country);

    List<UserAggregation> groupByCountry();

    List<CountryAggregation> countByCountry();
}
