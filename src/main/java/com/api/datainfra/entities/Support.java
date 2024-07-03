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

    public Support(){

    }

    public Support(Long id, String name, String descricao) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;
    }
}
