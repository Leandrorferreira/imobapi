package com.imob.imobapi.repository;

import com.imob.imobapi.model.PropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PropertyRepository extends JpaRepository<PropertyEntity, UUID> {
}
