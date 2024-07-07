package com.api.datainfra.services.impl;

import com.api.datainfra.entities.Support;
import com.api.datainfra.repositories.SupportRepository;
import com.api.datainfra.services.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupportServiceImpl implements SupportService {

    @Autowired
    private SupportRepository repository;

    @Override
    public List<Support> findAll(){
        return repository.findAll();
    }

    @Override
    public Support findById(Long id){
        return repository.findById(id).get();
    }

    @Override
    public Support save(Support support){
        return repository.save(support);
    }

    @Override
    public void deleteById(Long id){
        repository.deleteById(id);
    }

    @Override
    public Support update(Long id, Support support){
        Support obj = findById(id);
        obj.setName(support.getName());
        obj.setDescricao(support.getDescricao());
        return repository.save(obj);
    }
}
