package com.ufv.restservice.restservice;

public class User {

    private String name;
    private String email;

    public User(String name, String email, String[] roles, boolean admin) {
        this.name = name;
        this.email = email;
        this.roles = roles;
        this.admin = admin;
    }

    private String [] roles;
    private boolean admin;


}
