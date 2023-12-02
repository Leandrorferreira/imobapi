package com.imob.imobapi.controller;

import com.imob.imobapi.dtos.PropertyDTO;
import com.imob.imobapi.model.Property;
import com.imob.imobapi.service.PropertyService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/properties")
public class PropertyController {

    @Autowired
    private PropertyService productService;

    @GetMapping
    public ResponseEntity<List<Property>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Property>> findById(@PathVariable UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(productService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Property> create(@RequestBody @Valid PropertyDTO dto){
        var property = new Property();
        BeanUtils.copyProperties(dto, property);
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(property));
    }

    @PutMapping
    public ResponseEntity<Property> update(@RequestBody @Valid PropertyDTO dto){
        var property = new Property();
        BeanUtils.copyProperties(dto, property);
        return ResponseEntity.status(HttpStatus.OK).body(productService.update(property));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id){
        productService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
