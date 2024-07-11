package com.api.datainfra.services.impl;

import com.api.datainfra.entities.User;
import com.api.datainfra.repositories.UserRepository;
import com.api.datainfra.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll(){
        return repository.findAll();
    }

    @Override
    public User findById(Long id){
        return repository.findById(id).get();
    }

    @Override
    public User insert(User user){
        return repository.save(user);
    }

    @Override
    public void delete(Long id){
       repository.deleteById(id);
    }

    @Override
    public User update(Long id, User user){
        User obj = findById(id);
        obj.setName(user.getName());
        obj.setEmail(user.getCpf());
        obj.setEmail(user.getEmail());
        obj.setPhone(user.getPhone());
        obj.setCep(user.getCep());
        obj.setPassword(user.getPassword());
        return repository.save(obj);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

}
