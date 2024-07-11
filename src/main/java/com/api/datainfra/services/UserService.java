package com.api.datainfra.services;

import com.api.datainfra.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User insert(User user);
    User findById(Long id);
    List<User> findAll();
    void delete(Long id);
    User update(Long id, User user);
    Optional<User> findByEmail(String email);
}
