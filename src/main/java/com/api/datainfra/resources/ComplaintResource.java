package com.api.datainfra.resources;

import com.api.datainfra.entities.Complaint;
import com.api.datainfra.services.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/complaint")
public class ComplaintResource {

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

}
