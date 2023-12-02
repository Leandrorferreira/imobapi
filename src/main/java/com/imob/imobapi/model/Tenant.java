package com.imob.imobapi.model;

import com.imob.imobapi.model.enums.TenantStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity(name = "TENANT")
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private TenantStatus status;
}
