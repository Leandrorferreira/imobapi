package com.imob.imobapi.model;

import com.imob.imobapi.model.enums.PropertyType;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@Entity(name="PROPERTY")
public class Property implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String type;

    @Column(length = 50)
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

    private Date creatingDate;

    private Date lastUpdate;

    private String owner;
}
