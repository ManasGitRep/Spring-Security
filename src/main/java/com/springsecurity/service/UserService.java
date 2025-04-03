package com.springsecurity.service;

import com.springsecurity.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("Manas","123","m@gmail.com"));
    }
}
