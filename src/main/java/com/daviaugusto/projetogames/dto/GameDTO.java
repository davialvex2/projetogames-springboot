package com.daviaugusto.projetogames.dto;

import com.daviaugusto.projetogames.entites.Game;


public class GameDTO {

	private Long id;
	private String titulo;
	private Integer ano;
	private String imgUrl;
	private String descricaoCurta;
	
	public GameDTO() {
	}

	public GameDTO(Game obj) {
		super();
		id = obj.getId();
		titulo = obj.getTitulo();
		ano = obj.getAno();
		imgUrl = obj.getImgUrl();
		descricaoCurta = obj.getDescricaoCurta();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}

	
}
