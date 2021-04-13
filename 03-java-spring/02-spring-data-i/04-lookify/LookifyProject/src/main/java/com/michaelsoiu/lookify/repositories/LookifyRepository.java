package com.michaelsoiu.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michaelsoiu.lookify.models.Song;

@Repository
public interface LookifyRepository extends CrudRepository<Song, Long>{
	List<Song> findAll();
	List<Song> findTop10ByOrderByRatingDesc();
	List<Song> findByArtistContaining(String artist);
}
