package com.api.datainfra.controllers;

import com.api.datainfra.entities.Complaint;
import com.api.datainfra.services.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/complaint")
public class ComplaintController {

    @Autowired
    private ComplaintService service;

    @GetMapping
    public ResponseEntity<List<Complaint>> findAll(){
        List<Complaint> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Complaint> findById(@PathVariable Long id){
        Complaint obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public Complaint insert(@RequestBody Complaint complaint){
        return service.insert(complaint);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Complaint> update(@PathVariable Long id, @RequestBody Complaint complaint){
        Complaint obj = service.update(id, complaint);
        return ResponseEntity.ok().body(obj);
    }
}
