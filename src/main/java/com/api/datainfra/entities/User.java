package com.api.datainfra.entities;

import com.api.datainfra.entities.enums.UserStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

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
    private Integer userStatus;

    public User() {

    }

    public User(Long id, String name, String cpf, String email, String phone, String cep, String password, UserStatus userStatus) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
        this.cep = cep;
        this.password = password;
        setUserStatus(userStatus);
    }

    public UserStatus getUserStatus() {
        return UserStatus.valueOf(userStatus);
    }

    private void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.getCode();
    }

}
