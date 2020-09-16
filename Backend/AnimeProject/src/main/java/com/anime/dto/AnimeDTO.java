package com.anime.dto;

import com.anime.entity.Anime;

public class AnimeDTO {
	private Integer animeId;
	private String title;
	private String imageUrl;
	private String director;
	private String studio;
	
	public Integer getAnimeId() {
		return animeId;
	}
	
	public void setAnimeId(Integer animeId) {
		this.animeId = animeId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getStudio() {
		return studio;
	}
	
	public void setStudio(String studio) {
		this.studio = studio;
	}

	public static Anime dtoToEntity(AnimeDTO aDTO) {
		Anime entity = new Anime();
		entity.setAnimeId(aDTO.getAnimeId());
		entity.setDirector(aDTO.getDirector());
		entity.setImageUrl(aDTO.getImageUrl());
		entity.setStudio(aDTO.getStudio());
		entity.setTitle(aDTO.getTitle());
		return entity;
	}
	
	public static AnimeDTO entityToDTO(Anime anime) {
		AnimeDTO dto = new AnimeDTO();
		dto.setAnimeId(anime.getAnimeId());
		dto.setDirector(anime.getDirector());
		dto.setImageUrl(anime.getImageUrl());
		dto.setStudio(anime.getStudio());
		dto.setTitle(anime.getTitle());
		return dto;
	}
	
	@Override
	public String toString() {
		return "AnimeDTO [animeId=" + animeId + ", title=" + title + ", imageUrl=" + imageUrl
				 + ", director=" + director + ", studio=" + studio + "]";
	}

}
