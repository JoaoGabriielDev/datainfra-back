package com.api.datainfra.services;

import com.api.datainfra.entities.Support;

import java.util.List;

public interface SupportService {

    List<Support> findAll();
    Support findById(Long id);
    Support insert(Support support);
    void deleteById(Long id);
    Support update(Long id, Support support);
}
