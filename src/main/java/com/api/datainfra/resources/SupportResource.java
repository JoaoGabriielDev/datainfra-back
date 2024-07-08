package com.api.datainfra.resources;

import com.api.datainfra.entities.Support;
import com.api.datainfra.services.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Support insert(Support support){
        return service.insert(support);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Support> update(@PathVariable Long id, @RequestBody Support support){
        Support obj = service.update(id, support);
        return ResponseEntity.ok().body(obj);
    }
}
