package com.michaelsoiu.lookify.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.michaelsoiu.lookify.models.Song;
import com.michaelsoiu.lookify.services.LookifyService;

@Controller
@RequestMapping("/lookify")
public class HomeController {
	@Autowired
	private LookifyService lService;
	
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
		
	@RequestMapping("/songs")
	public String songList(Model model) {
		model.addAttribute("songs", lService.allSongs());
		return "songs.jsp";
	}
	
	@RequestMapping("/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("song", lService.findSong(id));
		return "show.jsp";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam("artist") String artist, Model model) {
		model.addAttribute("songs", lService.songsContainingArtist(artist));
		model.addAttribute("artist", artist);
		return "search.jsp";
	}
	
	@RequestMapping("/new")
	public String newSong(@ModelAttribute("song") Song song) {
		return "new.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}
		lService.createSong(song);
		return "redirect:/lookify/songs";
	}
	
	@RequestMapping("/topTen")
	public String topTen(Model model) {
		model.addAttribute("songs", lService.topTenByRating());
		return "topTen.jsp";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.lService.deleteSong(id);
		return "redirect:/lookify/songs";
	}
}
