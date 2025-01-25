package com.daviaugusto.projetogames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daviaugusto.projetogames.dto.GameDTO;
import com.daviaugusto.projetogames.dto.GameListDTO;
import com.daviaugusto.projetogames.dto.GameMinDTO;
import com.daviaugusto.projetogames.entites.Game;
import com.daviaugusto.projetogames.entites.GameList;
import com.daviaugusto.projetogames.repositories.GameListRepository;
import com.daviaugusto.projetogames.repositories.GameRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	

	public List<GameListDTO> findAll(){
		List<GameList> lista = gameListRepository.findAll();
		List<GameListDTO> dto = lista.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
	

}