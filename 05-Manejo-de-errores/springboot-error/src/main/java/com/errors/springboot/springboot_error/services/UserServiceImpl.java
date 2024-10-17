package com.errors.springboot.springboot_error.services;

import com.errors.springboot.springboot_error.models.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    //users viene de nuestra config como un bean
    //se usa un repositorio con sql para manejar usuarios, pero como es aprendizaje, usamos datos de memoria staticas
    @Autowired
    private List<User> users;


    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {

        Optional<User> user =
        users.stream()
                //filtra por el id
                .filter(usr -> usr.getId().equals(id))
                //devuelve un optional
                .findFirst();
        return user;
    }
}
