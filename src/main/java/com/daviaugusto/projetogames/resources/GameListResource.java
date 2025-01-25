package com.daviaugusto.projetogames.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daviaugusto.projetogames.dto.GameDTO;
import com.daviaugusto.projetogames.dto.GameListDTO;
import com.daviaugusto.projetogames.dto.GameMinDTO;
import com.daviaugusto.projetogames.service.GameListService;
import com.daviaugusto.projetogames.service.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListResource {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public ResponseEntity<List<GameListDTO>> findAll(){
		List<GameListDTO> lista = gameListService.findAll();
		return ResponseEntity.ok().body(lista);
	}
	


}
