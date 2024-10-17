package com.leandro.curso.springboot.webapp.springboot_webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        model.addAttribute("title","Hola mundo Spring Boot");
        model.addAttribute("name","Leandro");
        model.addAttribute("lastname","Gonzalez");



        return "details";
    }

}
