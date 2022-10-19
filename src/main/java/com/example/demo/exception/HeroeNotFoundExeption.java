package com.project.Heroes.exception;

public class HeroeNotFoundExeption extends RuntimeException{

    public HeroeNotFoundExeption (Long id){
        super("Could not find Heroe" + id);
    }
}
