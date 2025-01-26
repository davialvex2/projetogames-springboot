package com.daviaugusto.projetogames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.daviaugusto.projetogames.entites.GameList;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	@Modifying
	@Query(nativeQuery = true, value = "UPDATE tb_belonging SET posicao = :newPosition WHERE id_list = :listId AND id_game = :gameId")
	void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);

}
