package com.api.datainfra.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tb_Complaints")
@Data
public class Complaint implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String road;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "User_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "Neighborhood_id", nullable = false)
    private Neighborhood neighborhood;

    @ManyToOne
    @JoinColumn(name = "TypeComplaint_id", nullable = false)
    private TypeComplaint typeComplaint;

    public Complaint() {

    }

    public Complaint(Long id, String road, LocalDate date, User user, Neighborhood neighborhood, TypeComplaint typeComplaint) {
        this.id = id;
        this.road = road;
        this.date = date;
        this.user = user;
        this.neighborhood = neighborhood;
        this.typeComplaint = typeComplaint;
    }
}
