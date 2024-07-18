package com.in28minutes.learn_spring_framework.service;


import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        boolean isValidUsername = username.equalsIgnoreCase("admin");
        boolean isValidPassword = password.equalsIgnoreCase("admin");
        return isValidUsername && isValidPassword;
    }
}
