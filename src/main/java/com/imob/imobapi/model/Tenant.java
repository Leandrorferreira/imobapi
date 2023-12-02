package com.imob.imobapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity(name = "TENANT")
public class Tenant extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
}
