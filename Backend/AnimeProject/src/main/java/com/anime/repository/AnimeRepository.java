package com.anime.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anime.entity.Anime;

@Repository
public interface AnimeRepository extends CrudRepository<Anime, Integer>{

}
