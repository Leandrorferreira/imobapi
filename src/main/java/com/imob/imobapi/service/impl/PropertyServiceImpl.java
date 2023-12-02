package com.imob.imobapi.service.impl;

import com.imob.imobapi.model.Property;
import com.imob.imobapi.repository.PropertyRepository;
import com.imob.imobapi.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyRepository repository;

    @Override
    public Property save(Property property) {
        return repository.save(property);
    }

    @Override
    public List<Property> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Property> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Property update(Property property) {
        return repository.save(property);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
