package com.daviaugusto.projetogames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daviaugusto.projetogames.dto.GameDTO;
import com.daviaugusto.projetogames.entites.Game;
import com.daviaugusto.projetogames.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	

	public List<GameDTO> findAll(){
		List<Game> lista = gameRepository.findAll();
		List<GameDTO> dto = lista.stream().map(x -> new GameDTO(x)).toList();
		return dto;
	}

}
