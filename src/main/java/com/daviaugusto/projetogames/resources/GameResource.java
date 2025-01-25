package com.daviaugusto.projetogames.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daviaugusto.projetogames.dto.GameDTO;
import com.daviaugusto.projetogames.dto.GameMinDTO;
import com.daviaugusto.projetogames.service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public ResponseEntity<List<GameMinDTO>> findAll(){
		List<GameMinDTO> lista = gameService.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<GameDTO> findById(@PathVariable Long id){
		GameDTO dto = gameService.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	

}
