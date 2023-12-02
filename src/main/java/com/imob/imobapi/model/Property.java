package com.imob.imobapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type;

    private String description;

    private String address;

    private String propertyType;

    private String numberOfBedrooms;

    private String numberOfBathrooms;

    private BigDecimal totalArea;

    private Integer constructionYear;

    private String occupancyStatus;

    private BigDecimal price;

    private String specialFeatures;

    private Date listingDate;

    private Date lastUpdate;

    private String owner;
}
