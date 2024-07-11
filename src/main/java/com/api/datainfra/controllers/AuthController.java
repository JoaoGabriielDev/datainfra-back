package com.api.datainfra.controllers;

import com.api.datainfra.dto.LoginRequestDTO;
import com.api.datainfra.dto.RegisterRequestDTO;
import com.api.datainfra.dto.ResponseDTO;
import com.api.datainfra.entities.User;
import com.api.datainfra.infra.security.TokenService;
import com.api.datainfra.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService service;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginRequestDTO body){
        User user = this.service.findByEmail(body.email()).orElseThrow(() -> new RuntimeException("user not found"));
        if(passwordEncoder.matches(body.password(), user.getPassword())){
            String token = this.tokenService.generateToken(user);
            return ResponseEntity.ok(new ResponseDTO(user.getName(), token));
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody RegisterRequestDTO body){
        Optional<User> user = this.service.findByEmail(body.email());
        if (user.isEmpty()) {
            User newUser = new User();
            newUser.setName(body.name());
            newUser.setEmail(body.email());
            newUser.setCpf(body.cpf());
            newUser.setPhone(body.phone());
            newUser.setCep(body.cep());
            newUser.setPassword(passwordEncoder.encode(body.password()));
            this.service.insert(newUser);

                String token = this.tokenService.generateToken(newUser);
                return ResponseEntity.ok(new ResponseDTO(newUser.getName(), token));
            }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> findAll(User user){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

}
