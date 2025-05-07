package com.isaacbcdev.springweb.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private static int counter = 0;
    final private int id;
    private String name;
    private String lastname;
    private String email;

    public User(String name, String lastname) {
        id = ++counter;
        this.name = name;
        this.lastname = lastname;
    }

    public User(String name, String lastName, String mail) {
        id = ++counter;
        this.name = name;
        this.lastname = lastName;
        this.email = mail;
    }

    public String getFullName() {
        return name + " " + lastname;
    }
}