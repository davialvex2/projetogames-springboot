package com.daviaugusto.projetogames.dto;

import com.daviaugusto.projetogames.entites.GameList;

public class GameListDTO {

	private Long id;
	private String nome;
	
	public GameListDTO(){
	}

	public GameListDTO(GameList entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
}
