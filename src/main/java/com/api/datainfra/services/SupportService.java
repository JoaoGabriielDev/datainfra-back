package com.api.datainfra.services;

import com.api.datainfra.entities.Support;

import java.util.List;

public interface SupportService {

    List<Support> findAll(Support support);
    Support findById(Long id);
    Support save(Support support);
    void deleteById(Long id);
}
