package com.example.cat.Mapper;

import com.example.cat.Config.MapStructConfiguration;
import com.example.cat.DTO.DiseaseDTO;
import com.example.cat.Entity.DiseaseEntity;
import org.mapstruct.Mapper;

@Mapper(config = MapStructConfiguration.class)
public interface DiseaseMapper {
    DiseaseEntity toEntity(DiseaseDTO diseaseDTO);

    DiseaseDTO toDTO(DiseaseEntity diseaseEntity);
}
