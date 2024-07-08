package com.api.datainfra.resources;

import com.api.datainfra.entities.Neighborhood;
import com.api.datainfra.services.NeighborhoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Neighborhood insert(Neighborhood neighborhood){
        return service.insert(neighborhood);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Neighborhood> update(@PathVariable Long id, @RequestBody Neighborhood neighborhood){
        Neighborhood obj = service.update(id, neighborhood);
        return ResponseEntity.ok().body(obj);
    }

}
