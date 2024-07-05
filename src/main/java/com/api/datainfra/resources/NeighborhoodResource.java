package com.api.datainfra.resources;

import com.api.datainfra.entities.User;
import com.api.datainfra.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class NeighborhoodResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(User user){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }


}
