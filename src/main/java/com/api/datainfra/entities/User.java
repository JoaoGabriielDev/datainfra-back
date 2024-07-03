package com.api.datainfra.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tb_User")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long cpf;
    private LocalDate dateBirth;
    private String email;
    private String phone;
    private String cep;
    private String password;
    private String type;

    public User(){
    }
    public User(Long id, String name, Long cpf, LocalDate dateBirth, String email, String phone,
                String cep, String password, String type) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.dateBirth = dateBirth;
        this.email = email;
        this.phone = phone;
        this.cep = cep;
        this.password = password;
        this.type = type;
    }

}
