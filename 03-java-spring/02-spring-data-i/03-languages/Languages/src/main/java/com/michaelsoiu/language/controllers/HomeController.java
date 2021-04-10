package com.michaelsoiu.language.controllers;

import java.util.ArrayList;
import java.util.List;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.michaelsoiu.language.models.Language;
import com.michaelsoiu.language.services.LanguageService;

@Controller
@RequestMapping("/languages")
public class HomeController {
	@Autowired
	private LanguageService lService;
	
	@RequestMapping("")
	public String index(Model viewModel) {
		List<Language> languages = this.lService.getAllLanguages();
		viewModel.addAttribute("allLanguages", languages);
		return "index.jsp";
	}
	
	@PostMapping("")
	public String addLanguage(@RequestParam("name") String name, @RequestParam("creator") String creator, @RequestParam("currentVersion") String currentVersion, RedirectAttributes redirectAttr) {
		ArrayList<String> errors = new ArrayList<String>();
		if(name.equals("")) {
			errors.add("Please enter a language name");
		}
		if(creator.equals("")) {
			errors.add("Please enter the name of the creator");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
				redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/languages";
		}
		this.lService.addNewLanguage(name, creator, currentVersion);
		return "redirect:/languages";
	}
	
	@RequestMapping("/{id}")
	public String display(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("language", this.lService.getOneLanguage(id));
		return "display.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@ModelAttribute("language") Language language, Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("language", this.lService.getOneLanguage(id));
		return "edit.jsp";
	}
	
	@PostMapping("/edit/{id}")
	public String postEdit(@Valid @ModelAttribute("language") Language language, BindingResult result, Model viewModel, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			viewModel.addAttribute("language", this.lService.getOneLanguage(id));
			return "edit.jsp";
		}
		this.lService.updateLanguage(id, language);
		return "redirect:/languages";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.lService.deleteLanguage(id);
		return "redirect:/languages";
	}
}
