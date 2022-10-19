package com.project.Heroes.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HeroeModelMapper {
    HeroeModelMapper INSTANCE= Mappers.getMapper(HeroeModelMapper.class);
    HeroeDTO getToHeroeDTO (Heroe heroe);

}
