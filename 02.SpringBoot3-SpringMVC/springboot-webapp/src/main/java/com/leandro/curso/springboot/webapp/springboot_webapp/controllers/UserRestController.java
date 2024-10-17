package com.leandro.curso.springboot.webapp.springboot_webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserRestController {

    @GetMapping("/details2")
    public Map<String,Object> details(){
        Map<String,Object> body = new HashMap<>();
        body.put("title","Spring Boot");
        body.put("name","Leandro");
        body.put("lastname","Gonzalez");
        return body;
    }
}
