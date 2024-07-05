package com.api.datainfra.resources;

import com.api.datainfra.entities.Support;
import com.api.datainfra.services.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/support")
public class SupportResource {

    @Autowired
    private SupportService service;

    @GetMapping
    public ResponseEntity<List<Support>> findAll(){
        List<Support> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Support> findById(@PathVariable Long id){
        Support obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
