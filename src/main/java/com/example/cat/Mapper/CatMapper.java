package com.example.cat.Mapper;

import com.example.cat.Config.MapStructConfiguration;
import org.mapstruct.Mapper;

@Mapper(config = MapStructConfiguration.class)
public interface CatMapper {
    <E,D> E toEntity(D d);

    <E,D> D toDto(E e);
}
