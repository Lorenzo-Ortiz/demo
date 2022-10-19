package com.project.Heroes.controller;

import java.util.ArrayList;
import java.util.List;

import com.project.Heroes.model.Heroe;
import com.project.Heroes.model.HeroeDTO;
import com.project.Heroes.model.HeroeMapper;
import com.project.Heroes.service.HeroeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class HeroeController {

    @Autowired
    HeroeService heroeService;



    @GetMapping("/heroe")
    public List<Heroe> viewAllController() {
        return heroeService.viewAll();
    }

    @PostMapping("/heroe")
    public Heroe newHeroe (@RequestBody Heroe newHeroe){
        return heroeService.saveHero(newHeroe);
    }

    @GetMapping("/heroe/{id}")
    public Heroe viewOneHeroe (@PathVariable Long id){
        return heroeService.one(id);
    }

    @PutMapping("/heroe/{id}")
    public Heroe replaceHeroe (@RequestBody Heroe newHeroe,@PathVariable Long id){
         return heroeService.replace(newHeroe,id);
    }

    @DeleteMapping("/heroe/{id}")
    void deleteHeroe (@PathVariable Long id ){
        heroeService.delete(id);
    }
}
