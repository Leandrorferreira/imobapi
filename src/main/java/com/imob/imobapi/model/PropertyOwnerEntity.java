package com.imob.imobapi.model;

import com.imob.imobapi.domain.Property;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "PROPERTY_OWNER")
public class PropertyOwnerEntity extends BaseUserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToMany
    @JoinTable(name = "owner", joinColumns = @JoinColumn(name = "owner_id"))
    private List<PropertyEntity> propertiesOwner;
}
