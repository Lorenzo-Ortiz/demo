package com.project.Heroes.repository;

import com.project.Heroes.model.Heroe;
import com.project.Heroes.model.HeroeMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroeRepository extends JpaRepository<Heroe,Long> {
}
