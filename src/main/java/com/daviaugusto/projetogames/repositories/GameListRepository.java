package com.daviaugusto.projetogames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daviaugusto.projetogames.entites.GameList;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long>{

}
