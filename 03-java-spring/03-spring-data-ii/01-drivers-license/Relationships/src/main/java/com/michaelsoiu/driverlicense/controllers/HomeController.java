package com.michaelsoiu.driverlicense.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.michaelsoiu.driverlicense.models.License;
import com.michaelsoiu.driverlicense.models.Person;
import com.michaelsoiu.driverlicense.services.DMVService;

@Controller
public class HomeController {
	private final DMVService service;
	public HomeController(DMVService serv) {
		this.service = serv;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("MM/dd/yyyy"), true));
	}
	
	@RequestMapping("/")
	public String Index(Model model) {
		List<Person> people = service.getPeople();
		model.addAttribute("persons", people);
		return "index.jsp";
	}
	
	@PostMapping("/")
	public String CreatePerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}
		service.createPerson(person);
		return "redirect:/";
	}
	
	@RequestMapping("/{id}")
	public String ShowPerson(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", service.getPerson(id));
		return "show.jsp";
	}
	
	@RequestMapping("/new")
	public String NewPerson(@ModelAttribute("person") Person person) {
		return "new.jsp";
	}
	
	@RequestMapping("/licenses/new")
	public String NewLicense(@ModelAttribute("license") License lic, Model model) {
		List<Person> unlicensed = service.getUnlicensedPeople();
		model.addAttribute("persons", unlicensed);
		return "/licenses/new.jsp";
	}
	
	@PostMapping("/licenses")
	public String CreateLicense(@Valid @ModelAttribute("license") License lic, BindingResult result) {
		if(result.hasErrors())
			return "/licenses/new.jsp";
		service.createLicense(lic);
		return "redirect:/";
	}
}