package com.imob.imobapi.model;

import com.imob.imobapi.model.enums.PropertyType;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity(name="PROPERTY")
public class PropertyEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(length = 100)
    private String description;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false)
    private PropertyType propertyType;

    @Column(nullable = false)
    private Integer numberOfBedrooms;

    @Column(nullable = false)
    private Integer numberOfBathrooms;

    @Column(nullable = false)
    private BigDecimal totalArea;

    @Column(nullable = false)
    private Integer constructionYear;

    @Column(nullable = false)
    private String occupancyStatus;

    @Column(nullable = false)
    private BigDecimal price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id")
    private PropertyOwnerEntity owner;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tenant_id")
    private TenantEntity tenant;

    @CreatedDate
    private LocalDateTime created;

    @LastModifiedDate
    private LocalDateTime updated;
}
