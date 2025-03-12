package com.example.cat.Mapper;

import com.example.cat.Config.MapStructConfiguration;
import com.example.cat.DTO.CatDTO;
import com.example.cat.Entity.CatEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = MapStructConfiguration.class)
public interface CatMapper {
    CatEntity toEntity(CatDTO d);

    CatDTO toDto(CatEntity e);
    List<CatDTO> toDtoList(List<CatEntity> e);
}
