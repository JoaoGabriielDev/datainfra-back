package com.api.datainfra.resources;

import com.api.datainfra.entities.TypeComplaint;
import com.api.datainfra.services.TypeComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/type-complaint")
public class TypeComplaintResource {

    @Autowired
    private TypeComplaintService service;

    @GetMapping
    public ResponseEntity<List<TypeComplaint>> findAll(){
        List<TypeComplaint> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<TypeComplaint> findById(@PathVariable Long id){
        TypeComplaint obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
