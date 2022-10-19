package com.project.Heroes.model;

import lombok.Data;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.JpaParameters;

import java.util.List;


@Mapper (componentModel = "string")
public interface HeroeMapper {

    HeroeMapper INSTANCE= Mappers.getMapper(HeroeMapper.class);
    HeroeDTO getToHeroDTO (Heroe heroe);
    Heroe getToHeroe (HeroeDTO heroe);
    List<HeroeDTO> getListToHeroDTO (List <Heroe> heroe);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity (HeroeDTO heroeDTO, @MappingTarget Heroe heroe);





}
