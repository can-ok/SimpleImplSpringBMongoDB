/*
package com.canok.springmongo.service;

import com.canok.springmongo.dto.UserDto;
import com.canok.springmongo.entity.Gender;
import com.canok.springmongo.entity.User;
import com.canok.springmongo.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@SpringBootTest(properties = "spring.profiles.active:test")
@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
public class UserServiceTest {
    @Autowired
    public IUserService userService;
    @Autowired
    public UserRepository userRepository;

    @Test
    public void test_saveUser(){
        UserDto userDto=UserDto.builder().country("TR").name("test").gender(Gender.MALE).username("testUser").build();
        userService.saveUser(userDto.convertToUser());

        List<User> users=userRepository.findAll();

        Assertions.assertThat(users).hasSize(1);
    }
}
*/
