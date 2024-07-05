package com.api.datainfra.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tb_users")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private String email;
    private String phone;
    private String cep;
    private String password;
    private String type;

    public User() {

    }

    public User(Long id, String name, String cpf, String email, String phone, String cep, String password, String type) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
        this.cep = cep;
        this.password = password;
        this.type = type;
    }

}
