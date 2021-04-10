package com.michaelsoiu.language.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelsoiu.language.models.Language;
import com.michaelsoiu.language.repositories.LanguageRepository;

@Service
public class LanguageService {
	private LanguageRepository lRepo;
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	
	public Language getOneLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	public List<Language> getAllLanguages() {
		return this.lRepo.findAll();
	}
	
	public Language addLanguage(Language newLanguage) {
		return this.lRepo.save(newLanguage);
	}
	
	public Language addNewLanguage(String name, String creator, String currentVersion) {
		Language newLanguage = new Language(name, creator, currentVersion);
		return this.lRepo.save(newLanguage);
	}
	
	public Language updateLanguage(Long id, Language updatedLanguage) {
		return this.lRepo.save(updatedLanguage);
	}
	
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
}
