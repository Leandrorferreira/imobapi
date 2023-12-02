package com.imob.imobapi.service.impl;

import com.imob.imobapi.model.PropertyEntity;
import com.imob.imobapi.repository.PropertyRepository;
import com.imob.imobapi.service.PropertyService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyRepository repository;

    @Override
    @Transactional
    public PropertyEntity save(PropertyEntity property) {
        return repository.save(property);
    }

    @Override
    public List<PropertyEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<PropertyEntity> findById(UUID id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public PropertyEntity update(PropertyEntity property) {
        return repository.save(property);
    }

    @Override
    @Transactional
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
