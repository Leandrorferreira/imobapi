package com.imob.imobapi.service;

import com.imob.imobapi.model.PropertyEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PropertyService {
    PropertyEntity save(PropertyEntity property);

    List<PropertyEntity> findAll();

    Optional<PropertyEntity> findById(UUID id);

    PropertyEntity update(PropertyEntity property);

    void deleteById(UUID id);
}
