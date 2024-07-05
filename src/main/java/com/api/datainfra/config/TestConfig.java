package com.api.datainfra.config;

import com.api.datainfra.entities.User;
import com.api.datainfra.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {


    User u1 = new User(null, "Joao Gabriel", "70762874473", "jgabriellima1067@gmail.com",
            "83986584839", "58302340", "12345", "Cliente");

    userRepository.saveAll(Arrays.asList(u1));
}
}
