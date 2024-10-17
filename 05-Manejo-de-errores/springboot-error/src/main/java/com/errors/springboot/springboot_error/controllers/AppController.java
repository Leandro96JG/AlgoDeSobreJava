package com.errors.springboot.springboot_error.controllers;

import com.errors.springboot.springboot_error.models.domain.User;
import com.errors.springboot.springboot_error.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService service;

    @GetMapping("")
    public String index(){
        int value = 100 / 0;
        System.out.println("value = " + value);
        return "ok 200";
    }

    @GetMapping("/user/{id}")
    public User findUserByid(@PathVariable(name = "id") Long id){

        User user = service.findById(id);
        System.out.println("user = " + user);
        return user;
    }
}
