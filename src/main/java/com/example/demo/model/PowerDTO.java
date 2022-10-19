package com.project.Heroes.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class PowerDTO {
    private  Long  code;
    private String name;
    private String description;
}
