package com.api.datainfra.services;

import com.api.datainfra.entities.Neighborhood;

import java.util.List;

public interface NeighborhoodService {

    List<Neighborhood> findAll(Neighborhood neighborhood);
    Neighborhood findById(Long id);
    Neighborhood save(Neighborhood neighborhood);
    void deleteById(Long id);
}
