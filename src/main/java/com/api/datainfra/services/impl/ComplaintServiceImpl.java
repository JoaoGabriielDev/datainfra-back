package com.api.datainfra.services.impl;

import com.api.datainfra.entities.Complaint;
import com.api.datainfra.repositories.ComplaintRepository;
import com.api.datainfra.services.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintServiceImpl implements ComplaintService {

    @Autowired
    private ComplaintRepository repository;

    @Override
    public List<Complaint> findAll(Complaint complaint){
        return repository.findAll();
    }

    @Override
    public Complaint findById(Long id){
        return repository.findById(id).get();
    }

    @Override
    public Complaint save(Complaint complaint){
        return repository.save(complaint);
    }

    @Override
    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
