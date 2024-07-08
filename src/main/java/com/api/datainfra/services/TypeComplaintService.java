package com.api.datainfra.services;

import com.api.datainfra.entities.TypeComplaint;
import com.api.datainfra.entities.User;

import java.util.List;

public interface TypeComplaintService {

    List<TypeComplaint> findAll();
    TypeComplaint findById(Long id);
    TypeComplaint insert(TypeComplaint typeComplaint);
    void deleteById(Long id);
    TypeComplaint update(Long id, TypeComplaint typeComplaint);
}
