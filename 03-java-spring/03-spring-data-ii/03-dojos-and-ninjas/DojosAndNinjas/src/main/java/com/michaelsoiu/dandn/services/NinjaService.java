package com.michaelsoiu.dandn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelsoiu.dandn.models.Dojo;
import com.michaelsoiu.dandn.models.Ninja;
import com.michaelsoiu.dandn.repositories.DojoRepository;
import com.michaelsoiu.dandn.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private DojoRepository dRepo;
	@Autowired
	private NinjaRepository nRepo;
	
	public Dojo getDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	public List<Dojo> getDojos() {
		return this.dRepo.findAll();
	}
	
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
}
