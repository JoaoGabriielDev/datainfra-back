package com.api.datainfra.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "tb_Support")
@Data
public class Support implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "User_id", nullable = false)
    private User user;

    public Support() {

    }

    public Support(Long id, String name, String descricao, User user) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;
        this.user = user;
    }
}
