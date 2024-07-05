package com.api.datainfra.services.impl;

import com.api.datainfra.entities.TypeComplaint;
import com.api.datainfra.repositories.TypeComplaintRepository;
import com.api.datainfra.services.TypeComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeComplaintServiceImpl implements TypeComplaintService {

    @Autowired
    private TypeComplaintRepository repository;

    @Override
    public List<TypeComplaint> findAll(TypeComplaint typeComplaint){
        return repository.findAll();
    }

    @Override
    public TypeComplaint findById(Long id){
        return repository.findById(id).get();
    }

    @Override
    public TypeComplaint save(TypeComplaint typeComplaint){
        return repository.save(typeComplaint);
    }

    @Override
    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
