package com.michaelsoiu.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelsoiu.lookify.models.Song;
import com.michaelsoiu.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	private LookifyRepository lRepo;
	public LookifyService(LookifyRepository repo) {
		this.lRepo = repo;
	}
	
	public List<Song> allSongs() {
		return lRepo.findAll();
	}
	
	public Song findSong(Long id) {
		return lRepo.findById(id).orElse(null);
	}
	
	public List<Song> topTenByRating() {
		return lRepo.findTop10ByOrderByRatingDesc();
	}
	
	public List<Song> songsContainingArtist(String artist) {
		return lRepo.findByArtistContaining(artist);
	}
	
	public Song createSong (Song song) {
		return lRepo.save(song);
	}
	
	public Song updateSong(Song updatedSong) {
		return lRepo.save(updatedSong);
	}
	
	public void deleteSong(Long id) {
		lRepo.deleteById(id);
	}
}
