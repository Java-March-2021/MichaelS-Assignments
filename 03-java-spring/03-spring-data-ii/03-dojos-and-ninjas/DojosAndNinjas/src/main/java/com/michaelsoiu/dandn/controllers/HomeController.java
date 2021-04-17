package com.michaelsoiu.dandn.controllers;

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

import com.michaelsoiu.dandn.models.Dojo;
import com.michaelsoiu.dandn.models.Ninja;
import com.michaelsoiu.dandn.services.DojoService;
import com.michaelsoiu.dandn.services.NinjaService;

@Controller
public class HomeController {
	@Autowired
	private DojoService dService;
	@Autowired
	private NinjaService nService;
	
	@RequestMapping("/")
	public String Index() {
		return "landing.jsp";
	}
	
	@RequestMapping("/dojos/new")
	public String NewDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "/dojos/new.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "/dojos/new.jsp";
		}
		else {
			this.dService.createDojo(dojo);
		}
		return "redirect:/dojos/show";
	}
	
	@GetMapping("/dojos/show")
	public String display(Model model) {
		List<Dojo> dojos = this.nService.getDojos();
		model.addAttribute("dojos", dojos);
		return "/dojos/show.jsp";
	}
	
	@GetMapping("/ninjas/new")
	public String NewNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", this.nService.getDojos());
		return "/ninjas/new.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojos", this.nService.getDojos());
			return "/ninjas/new.jsp";
		}
		else {
			this.nService.createNinja(ninja);
		}
		return "redirect:/dojos/show";
	}
	
	@GetMapping("/dojos/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", this.nService.getDojo(id));
		return "/dojos/id.jsp";
	}
}
