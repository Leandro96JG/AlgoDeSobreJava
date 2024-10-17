package com.errors.springboot.springboot_error.models.domain;

public class Rol {
    private String name;

    public Rol(String name) {
        this.name = name;
    }

    public Rol() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
