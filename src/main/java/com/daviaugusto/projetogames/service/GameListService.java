package com.daviaugusto.projetogames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daviaugusto.projetogames.dto.GameListDTO;
import com.daviaugusto.projetogames.entites.GameList;
import com.daviaugusto.projetogames.projections.GameMinProjection;
import com.daviaugusto.projetogames.repositories.GameListRepository;
import com.daviaugusto.projetogames.repositories.GameRepository;

import jakarta.transaction.Transactional;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;
	

	public List<GameListDTO> findAll(){
		List<GameList> lista = gameListRepository.findAll();
		List<GameListDTO> dto = lista.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
	
	@Transactional
	public void move (Long listId, int posicao, int novaPosicao) {
		List<GameMinProjection> lista = gameRepository.buscarGameList(listId);
		 GameMinProjection obj = lista.remove(posicao);
		 
		 lista.add(novaPosicao, obj);
		 
		 int min = posicao < novaPosicao ? posicao : novaPosicao;
		 int max = posicao < novaPosicao ? novaPosicao : posicao;
		 
		 for(int i = min; i <= max; i++) {
			 gameListRepository.updateBelongingPosition(listId, lista.get(i).getId(), i);
		 }
		 
		
	}
	

}
