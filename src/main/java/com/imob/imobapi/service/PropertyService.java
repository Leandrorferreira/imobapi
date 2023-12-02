package com.imob.imobapi.service;

import com.imob.imobapi.model.Property;

import java.util.List;
import java.util.Optional;

public interface PropertyService {
    Property save(Property property);

    List<Property> findAll();

    Optional<Property> findById(Long id);

    Property update(Property property);

    void deleteById(Long id);
}
