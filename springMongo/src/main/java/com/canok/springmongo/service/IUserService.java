package com.canok.springmongo.service;

import com.canok.springmongo.entity.User;

import java.util.List;

public interface IUserService {
    void saveUser(User user);

    List<User> findUserByCountry(String country);
}
