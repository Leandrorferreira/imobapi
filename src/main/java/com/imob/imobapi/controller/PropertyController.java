package com.imob.imobapi.controller;

import com.imob.imobapi.controller.mapper.PropertyMapper;
import com.imob.imobapi.dtos.PropertyDTO;
import com.imob.imobapi.model.PropertyEntity;
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

    @Autowired
    private PropertyMapper mapper;

    @GetMapping
    public ResponseEntity<List<PropertyEntity>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<PropertyEntity>> findById(@PathVariable UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(productService.findById(id));
    }

    @PostMapping
    public ResponseEntity<PropertyEntity> create(@RequestBody @Valid PropertyDTO dto){
        PropertyEntity property = mapper.dtoToEntity(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(property));
    }

    @PutMapping
    public ResponseEntity<PropertyEntity> update(@RequestBody @Valid PropertyDTO dto){
        var property = new PropertyEntity();
        BeanUtils.copyProperties(dto, property);
        return ResponseEntity.status(HttpStatus.OK).body(productService.update(property));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id){
        productService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
