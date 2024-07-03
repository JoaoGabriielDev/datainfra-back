package com.api.datainfra.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "tb_Neighborhood")
@Data
public class Neighborhood implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Neighborhood(){

    }
    public Neighborhood(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
