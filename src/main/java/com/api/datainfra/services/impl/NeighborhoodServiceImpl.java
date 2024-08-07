package com.api.datainfra.services.impl;

import com.api.datainfra.entities.Neighborhood;
import com.api.datainfra.entities.Support;
import com.api.datainfra.repositories.NeighborhoodRepository;
import com.api.datainfra.services.NeighborhoodService;
import org.hibernate.sql.Update;
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
    public Neighborhood insert(Neighborhood neighborhood){
        return repository.save(neighborhood);
    }

    @Override
    public void deleteById(Long id){
        repository.deleteById(id);
    }

    @Override
    public Neighborhood update(Long id, Neighborhood neighborhood){
        Neighborhood obj = findById(id);
        obj.setName(neighborhood.getName());
        return repository.save(obj);
    }
}
