package com.api.datainfra.services;

import com.api.datainfra.entities.Complaint;

import java.util.List;

public interface ComplaintService {

    List<Complaint> findAll(Complaint complaint);
    Complaint findById(Long id);
    Complaint save(Complaint complaint);
    void deleteById(Long id);
}