package com.api.datainfra.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tb_Complaint")
@Data
public class Complaint implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String road;
    private LocalDate date;


    public Complaint(){
    }

    public Complaint(Long id, String road, LocalDate date) {
        this.id = id;
        this.road = road;
        this.date = date;
    }

}
