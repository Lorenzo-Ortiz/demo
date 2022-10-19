package com.project.Heroes.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Power {
    private @Id @GeneratedValue Long  code;
    private String name;
    private String description;

}
