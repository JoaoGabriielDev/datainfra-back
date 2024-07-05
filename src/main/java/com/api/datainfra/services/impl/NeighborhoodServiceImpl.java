package com.api.datainfra.services.impl;

import com.api.datainfra.entities.Neighborhood;
import com.api.datainfra.repositories.NeighborhoodRepository;
import com.api.datainfra.services.NeighborhoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeighborhoodServiceImpl implements NeighborhoodService {

    @Autowired
    private NeighborhoodRepository repository;

    @Override
    public List<Neighborhood> findAll(){
        return repository.findAll();
    }

    @Override
    public Neighborhood findById(Long id){
        return repository.findById(id).get();
    }

    @Override
    public Neighborhood save(Neighborhood neighborhood){
        return repository.save(neighborhood);
    }

    @Override
    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
