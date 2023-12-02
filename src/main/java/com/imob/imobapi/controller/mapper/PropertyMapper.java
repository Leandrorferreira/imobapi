package com.imob.imobapi.controller.mapper;

import com.imob.imobapi.dtos.PropertyDTO;
import com.imob.imobapi.model.PropertyEntity;
import org.mapstruct.Mapper;

@Mapper
public interface PropertyMapper {
    PropertyDTO entityToDTO(PropertyEntity entity);
    PropertyEntity dtoToEntity(PropertyDTO dto);
}
