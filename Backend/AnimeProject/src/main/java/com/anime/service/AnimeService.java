package com.anime.service;

import java.util.List;

import com.anime.dto.AnimeDTO;
import com.anime.exception.AnimeException;

public interface AnimeService {
	public AnimeDTO getAnimeById(Integer animeId) throws AnimeException;
	public List<AnimeDTO> getAllAnime() throws AnimeException;
}
