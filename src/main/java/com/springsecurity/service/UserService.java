package com.springsecurity.service;

import com.springsecurity.model.User;
<<<<<<< HEAD
import com.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Read all
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Read one
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Update
    public User updateUser(Long id, User updatedUser) {
        Optional<User> existing = userRepository.findById(id);
        if (existing.isPresent()) {
            User user = existing.get();
            user.setUsername(updatedUser.getUsername());
            user.setEmail(updatedUser.getEmail());
            user.setPassword(updatedUser.getPassword());
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    // Delete
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
=======

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("Manas","123","m@gmail.com"));
>>>>>>> 20a48395b4715dd73e7ee7e61a09e43c08f6120e
    }
}
