package com.api.datainfra.services;

import com.api.datainfra.entities.TypeComplaint;

import java.util.List;

public interface TypeComplaintService {

    List<TypeComplaint> findAll(TypeComplaint typeComplaint);
    TypeComplaint findById(Long id);
    TypeComplaint save(TypeComplaint typeComplaint);
    void deleteById(Long id);
}
