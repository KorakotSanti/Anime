package com.anime.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anime.dto.AnimeDTO;
import com.anime.entity.Anime;
import com.anime.exception.AnimeException;
import com.anime.repository.AnimeRepository;

@Service(value="animeService")
@Transactional
public class AnimeServiceImpl implements AnimeService{
	
	@Autowired
	private AnimeRepository animeRepo;
	
	@Override
	public AnimeDTO getAnimeById(Integer animeId) throws AnimeException {
		Optional<Anime> optionalA = animeRepo.findById(animeId);
		Anime aEntity = optionalA.orElseThrow(()-> new AnimeException("Service.ANIME_NOT_FOUND"));
		return AnimeDTO.entityToDTO(aEntity);
	}

	@Override
	public List<AnimeDTO> getAllAnime() throws AnimeException {
		Iterable<Anime> animes = animeRepo.findAll();
		List<AnimeDTO> animeDTOs = new ArrayList<AnimeDTO>();
		for(Anime a: animes) {
			animeDTOs.add(AnimeDTO.entityToDTO(a));
		}
		if(animeDTOs.isEmpty()) {
			throw new AnimeException("Service.ANIME_NOT_FOUND");
		}
		
		return animeDTOs;
	}

}
