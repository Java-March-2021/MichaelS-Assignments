package com.michaelsoiu.strings.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String hello() {
		return "Hello, Client. How are you doing?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Spring boot is great! So easy to just respond with strings";
	}
}