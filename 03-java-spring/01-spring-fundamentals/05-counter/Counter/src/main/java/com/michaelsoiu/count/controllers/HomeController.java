package com.michaelsoiu.count.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		Integer currentCount =(Integer) session.getAttribute("count");
		currentCount++;
		session.setAttribute("count", currentCount);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model viewModel) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		Integer currentCount =(Integer) session.getAttribute("count");
		currentCount++;
		viewModel.addAttribute("count", session.getAttribute("count"));
		return "counting.jsp";
	}
}
