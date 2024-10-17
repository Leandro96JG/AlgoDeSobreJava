package com.errors.springboot.springboot_error.models.domain;

public class User {
    private Long id;
    private String name;
    private String lastName;

    private Rol rol;

    public Rol getRol() {
        return rol;
    }

//    public String getRolname() {
//        return rol.getName();
//    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public User(Long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
