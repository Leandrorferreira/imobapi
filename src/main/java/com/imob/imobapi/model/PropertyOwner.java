package com.imob.imobapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity(name = "PROPERTY_OWNER")
public class PropertyOwner extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
}
