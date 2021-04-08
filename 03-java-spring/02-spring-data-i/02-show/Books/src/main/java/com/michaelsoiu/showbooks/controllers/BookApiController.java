package com.michaelsoiu.showbooks.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.michaelsoiu.showbooks.models.Book;
import com.michaelsoiu.showbooks.services.BookService;

@RestController
@RequestMapping("api")
public class BookApiController {
	private BookService bService;
	public BookApiController(BookService service) {
		this.bService = service;
	}
	@RequestMapping("")
	public String index() {
		return "Hello World!";
	}
	
	@RequestMapping("{id}")
	public Book showBook(@PathVariable Long id) {
		return this.bService.getOneBook(id);
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public Book edit(@PathVariable("id") Long id, Book updatedBook) {
		return this.bService.updateBook(id, updatedBook);
	}
	
	@RequestMapping("/delete/{id}")
	public String removeBook(@PathVariable("id") Long id) {
		this.bService.deleteBook(id);
		return id + " has been deleted";
	}
}
