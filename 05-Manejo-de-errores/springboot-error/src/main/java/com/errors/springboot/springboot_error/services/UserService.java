package com.errors.springboot.springboot_error.services;

import com.errors.springboot.springboot_error.models.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(Long id);
}
