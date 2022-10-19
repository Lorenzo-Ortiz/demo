package com.project.Heroes.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Heroe {

    private @Id @GeneratedValue Long id;
    private String name;
    private String power;

    private String universe;

    Heroe (){};

    public Heroe (String name, String power){
        this.name=name;
        this.power=power;
    }

}
