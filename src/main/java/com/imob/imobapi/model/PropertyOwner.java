package com.imob.imobapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity(name = "PROPERTY_OWNER")
public class PropertyOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 100)
    private String emailAddress;

    @Column(nullable = false, length = 20)
    private String phoneNumber;
}
