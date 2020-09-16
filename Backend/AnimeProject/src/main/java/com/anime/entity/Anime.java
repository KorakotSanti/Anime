package com.anime.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "animes")	
public class Anime {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animeId == null) ? 0 : animeId.hashCode());
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + ((imageUrl == null) ? 0 : imageUrl.hashCode());
		result = prime * result + ((studio == null) ? 0 : studio.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Anime other = (Anime) obj;
		if (animeId == null) {
			if (other.animeId != null)
				return false;
		} else if (!animeId.equals(other.animeId))
			return false;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (imageUrl == null) {
			if (other.imageUrl != null)
				return false;
		} else if (!imageUrl.equals(other.imageUrl))
			return false;
		if (studio == null) {
			if (other.studio != null)
				return false;
		} else if (!studio.equals(other.studio))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
