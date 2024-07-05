package com.api.datainfra.resources;

import com.api.datainfra.entities.Neighborhood;
import com.api.datainfra.services.NeighborhoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/neigborhoods")
public class NeighborhoodResource {

    @Autowired
    private NeighborhoodService service;

    @GetMapping
    public ResponseEntity<List<Neighborhood>> findAll(Neighborhood neighborhood){
        List<Neighborhood> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Neighborhood> findById(@PathVariable Long id){
        Neighborhood obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
