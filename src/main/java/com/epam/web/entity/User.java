package com.epam.web.entity;

public class User implements Entity {

    private Long id;
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role){
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Long getId(){return id;}
}
