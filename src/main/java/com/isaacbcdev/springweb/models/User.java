package com.isaacbcdev.springweb.models;

import lombok.Data;

@Data
public class User {
    private String name;
    private String lastname;
    private String email;

    private User() {
    }

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public User(String name, String lastName, String mail) {
        this.name = name;
        this.lastname = lastName;
        this.email = mail;
    }

    public String getFullName() {
        return name + " " + lastname;
    }
}