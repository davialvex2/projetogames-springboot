package com.daviaugusto.projetogames.dto;

import com.daviaugusto.projetogames.entites.Game;
import com.daviaugusto.projetogames.projections.GameMinProjection;


public class GameMinDTO {

	private Long id;
	private String titulo;
	private Integer ano;
	private String imgUrl;
	private String descricaoCurta;
	
	public GameMinDTO() {
	}

	public GameMinDTO(Game obj) {
		id = obj.getId();
		titulo = obj.getTitulo();
		ano = obj.getAno();
		imgUrl = obj.getImgUrl();
		descricaoCurta = obj.getDescricaoCurta();
	}
	
	public GameMinDTO(GameMinProjection obj) {
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
