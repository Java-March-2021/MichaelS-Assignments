package com.michaelsoiu.driverlicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelsoiu.driverlicense.models.License;
import com.michaelsoiu.driverlicense.models.Person;
import com.michaelsoiu.driverlicense.repositories.LicenseRepository;
import com.michaelsoiu.driverlicense.repositories.PersonRepository;

@Service
public class DMVService {
	private final PersonRepository pRepo;
	private final LicenseRepository lRepo;
	public DMVService(PersonRepository pRepo, LicenseRepository lRepo) {
		this.pRepo = pRepo;
		this.lRepo = lRepo;
	}
	
	public Person getPerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public List<Person> getPeople() {
		return this.pRepo.findAll();
	}
	
	public List<Person> getUnlicensedPeople() {
		return this.pRepo.findByLicenseIdIsNull();
	}
	
	public Person createPerson(Person p) {
		return this.pRepo.save(p);
	}
	
	public License createLicense(License l) {
		l.setNumber(this.generateLicenseNumber());
		return this.lRepo.save(l);
	}
	
	public int generateLicenseNumber() {
		License l = this.lRepo.findTopByOrderByNumberDesc();
		if(l == null)
			return 1;
		int largestNumber = l.getNumber();
		largestNumber++;
		return (largestNumber);
	}
}
