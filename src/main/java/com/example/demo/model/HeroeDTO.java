package com.project.Heroes.model;


import lombok.Data;


@Data
public class HeroeDTO {

    private Long id;
    private String name;
    private String power;

    private String universe;

    HeroeDTO (){};

    public HeroeDTO (String name, String power){
        this.name=name;
        this.power=power;
    }



}
