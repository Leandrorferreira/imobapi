package com.imob.imobapi.service;

import com.imob.imobapi.model.Property;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PropertyService {
    Property save(Property property);

    List<Property> findAll();

    Optional<Property> findById(UUID id);

    Property update(Property property);

    void deleteById(UUID id);
}
