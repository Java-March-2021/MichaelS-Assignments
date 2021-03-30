package com.michaelsoiu.ninjacode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
	private Boolean correctCode(String answer) {
		return answer.equals("bushido");
	}
	private String[] getQualities() {
		return new String[] {
				"Loyalty", "Courage", "Veracity", "Compassion", "Honor"
		};
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value = "/attempt", method = RequestMethod.POST)
	public String Attempt(@RequestParam(value = "guess") String guess, Model model, RedirectAttributes rAttributes) {
		if(correctCode(guess)) {
			return "redirect:/correct";
		}
		rAttributes.addFlashAttribute("error", "You do not know the way");
		return "redirect:/";
	}
	
	@RequestMapping("/correct")
	public String Correct(Model model) {
		model.addAttribute("qualities", getQualities());
		return "correct.jsp";
	}
}
