package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entites.Game;

public class GameMinDTO {

	private Long id;
	private String title;

	private Integer year;
	private String imgUrL;
	private String shortDescription;

	public GameMinDTO() {
	}

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrL = entity.getImgUrL();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrL() {
		return imgUrL;
	}

	public String getShortDescription() {
		return shortDescription;
	}

}
