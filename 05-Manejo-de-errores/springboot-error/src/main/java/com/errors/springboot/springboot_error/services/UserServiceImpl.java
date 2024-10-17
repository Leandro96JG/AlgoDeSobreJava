package com.errors.springboot.springboot_error.services;

import com.errors.springboot.springboot_error.models.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();
        this.users.add(new User(1L,"Juan","Carlo"));
        this.users.add(new User(2L,"Michel","Cortez"));
        this.users.add(new User(3L,"Rosa","Perez"));
        this.users.add(new User(4L,"Maxi","Riquelme"));
        this.users.add(new User(5L,"Jorge","Bataglia"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(Long id) {


        User user = null;
        for (User u : users){
            if(u.getId().equals(id)){
                user = u;
                break;
            }
        }
        return user;
    }
}
