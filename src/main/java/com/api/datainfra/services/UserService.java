package com.api.datainfra.services;

import com.api.datainfra.entities.User;

import java.util.List;

public interface UserService {

    User save(User user);
    User findById(Long id);
    List<User> findAll();
    void deleteById(Long id);
}
