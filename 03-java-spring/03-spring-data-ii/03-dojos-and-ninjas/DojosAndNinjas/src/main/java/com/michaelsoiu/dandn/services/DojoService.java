package com.michaelsoiu.dandn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelsoiu.dandn.models.Dojo;
import com.michaelsoiu.dandn.models.Ninja;
import com.michaelsoiu.dandn.repositories.DojoRepository;
import com.michaelsoiu.dandn.repositories.NinjaRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dRepo;
	@Autowired
	private NinjaRepository nRepo;
	
	public List<Ninja> getAllNinjas() {
		return this.nRepo.findAll();
	}
	
	public Dojo createDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
}
