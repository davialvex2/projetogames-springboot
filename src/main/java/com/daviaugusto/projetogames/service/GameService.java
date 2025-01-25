package com.daviaugusto.projetogames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daviaugusto.projetogames.dto.GameDTO;
import com.daviaugusto.projetogames.dto.GameMinDTO;
import com.daviaugusto.projetogames.entites.Game;
import com.daviaugusto.projetogames.projections.GameMinProjection;
import com.daviaugusto.projetogames.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	

	public List<GameMinDTO> findAll(){
		List<Game> lista = gameRepository.findAll();
		List<GameMinDTO> dto = lista.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	public GameDTO findById(Long id) {
		Game obj = gameRepository.findById(id).get();
		GameDTO gdto = new GameDTO(obj);
		return gdto;
	}
	
	public List<GameMinDTO> findGameList(Long id){
		List<GameMinProjection> gmp = gameRepository.buscarGameList(id);
		return gmp.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
