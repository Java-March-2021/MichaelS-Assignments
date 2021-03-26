package com.michaelsoiu.routingfam.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping(value = "/python", method = RequestMethod.GET)
	public String python() {
		return "Pythong/Django was awesome!...except I don't know because I didn't take that stack.";
	}
	
	@RequestMapping(value = "/java", method = RequestMethod.GET)
	public String java() {
		return "Java/Spring is better...I mean. Obviously.";
	}
}
