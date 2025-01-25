package com.daviaugusto.projetogames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daviaugusto.projetogames.entites.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
