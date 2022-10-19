package com.project.Heroes.service;


import com.project.Heroes.model.Heroe;
import com.project.Heroes.exception.HeroeNotFoundExeption;
import com.project.Heroes.model.HeroeDTO;
import com.project.Heroes.model.HeroeMapper;
import com.project.Heroes.model.HeroeModelMapper;
import com.project.Heroes.repository.HeroeRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


//@RequiredArgsConstructor
@Data
@Service
public class HeroeService {
    @Autowired
    HeroeRepository heroeRepository;

  // @Autowired
   // private final HeroeMapper heroeMapper;




    public ArrayList<Heroe> viewAll (){
        return (ArrayList<Heroe>) heroeRepository.findAll();
    }

    public Heroe saveHero(Heroe heroe){

        return heroeRepository.save(heroe);
    }

    public Heroe one (Long id){

        return heroeRepository.findById(id).orElseThrow(() -> new HeroeNotFoundExeption(id));


    }

    public Heroe replace (Heroe newHeroe,Long id){
        return heroeRepository.findById(id).map(heroe
                -> {
            heroe.setName(newHeroe.getName());
            heroe.setPower(newHeroe.getPower());
            heroe.setUniverse(newHeroe.getUniverse());
            return heroeRepository.save(heroe);}).orElseGet(()-> {
            newHeroe.setId(id);
            return heroeRepository.save(newHeroe);
        });

        }

    public void delete (Long id){
        heroeRepository.deleteById(id);
    }

}
