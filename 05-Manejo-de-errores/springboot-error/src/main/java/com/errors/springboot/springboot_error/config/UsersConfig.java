package com.errors.springboot.springboot_error.config;

import com.errors.springboot.springboot_error.models.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class UsersConfig {

    @Bean
    public List<User> users(){
        List<User> users = new ArrayList<>();
        users.add(new User(1L,"Juan","Carlo"));
        users.add(new User(2L,"Michel","Cortez"));
        users.add(new User(3L,"Rosa","Perez"));
        users.add(new User(4L,"Maxi","Riquelme"));
        users.add(new User(5L,"Jorge","Bataglia"));
        return users;
    }
}
