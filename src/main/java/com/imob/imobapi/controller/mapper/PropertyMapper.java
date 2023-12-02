package com.imob.imobapi.controller.mapper;

import com.imob.imobapi.domain.Property;
import com.imob.imobapi.dtos.PropertyDTO;
import org.mapstruct.Mapper;

@Mapper
public interface PropertyMapper {
    PropertyDTO domainToDTO(Property property);
}
