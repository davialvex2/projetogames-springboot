package com.daviaugusto.projetogames.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.daviaugusto.projetogames.entites.Game;
import com.daviaugusto.projetogames.projections.GameMinProjection;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
	
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.titulo, tb_game.game_ano AS `ano`, tb_game.img_url AS imgUrl,
			tb_game.descricao_curta AS descricaoCurta, tb_belonging.posicao
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.id_game
			WHERE tb_belonging.id_list = :listId
			ORDER BY tb_belonging.posicao
				""")
	List<GameMinProjection> buscarGameList(Long listId);

}
