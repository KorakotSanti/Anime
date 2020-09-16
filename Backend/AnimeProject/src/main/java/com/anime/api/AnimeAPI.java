package com.anime.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anime.dto.AnimeDTO;
import com.anime.exception.AnimeException;
import com.anime.service.AnimeService;

@CrossOrigin
@RestController
@RequestMapping(value="/anime")
public class AnimeAPI {
	
	@Autowired
	private AnimeService aService;
	@Autowired
	public Environment environment;
	
	@GetMapping(value="/title/{animeId}")
	public ResponseEntity<AnimeDTO> getAnimeById(@PathVariable Integer animeId) throws AnimeException{
		AnimeDTO anime = aService.getAnimeById(animeId);
		return new ResponseEntity<>(anime,HttpStatus.OK);
	}
	
	@GetMapping(value="/title")
	public ResponseEntity<List<AnimeDTO>> getAllAnime() throws AnimeException{
		List<AnimeDTO> animes = aService.getAllAnime();
		return new ResponseEntity<>(animes,HttpStatus.OK);
	}
}
	