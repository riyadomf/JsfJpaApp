package com.jsfjpa.controllers;


import com.jsfjpa.services.DataService;
import com.jsfjpa.entities.User;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@RequestScoped
@Named
public class UsersController {
    @Inject
    DataService dataService;
    private List<User> allUsers;

    @PostConstruct
    public void initialize() {
        this.allUsers = dataService.getAllUsers();
    }

    public List<User> getAllUsers() {
        return allUsers;
    }
}
