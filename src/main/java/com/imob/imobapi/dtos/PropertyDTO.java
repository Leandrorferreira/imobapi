package com.imob.imobapi.dtos;

import com.imob.imobapi.model.enums.OccupancyStatus;
import com.imob.imobapi.model.enums.PropertyType;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record PropertyDTO(
        @NotBlank
        @Size(max = 100)
        String description,
        @NotBlank
        @Size(max = 100)
        String address,
        @NotBlank
        PropertyType propertyType,
        @NotBlank
        Integer numberOfBedrooms,
        @NotBlank
        Integer numberOfBathrooms,
        @NotBlank
        BigDecimal totalArea,
        @NotBlank
        Integer constructionYear,
        OccupancyStatus occupancyStatus,
        @Column(nullable = false)
        BigDecimal price
) {
}
