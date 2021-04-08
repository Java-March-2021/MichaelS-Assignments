package com.michaelsoiu.showbooks.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.michaelsoiu.showbooks.models.Book;
import com.michaelsoiu.showbooks.services.BookService;

@Controller
public class BookController {
	private BookService bService;
	public BookController(BookService service) {
		this.bService = service;
	}
	
	@GetMapping("{id}")
	public String showBook(@PathVariable Long id, Model model) {
		model.addAttribute("book", this.bService.getOneBook(id));
		return "ShowBook.jsp";
	}
	
	@RequestMapping("/books")
	public String index(Model model) {
		List<Book> books = bService.allBooks();
		model.addAttribute("books", books);
		return "index.jsp";
	}
	
	@GetMapping("/books/new")
	public String add() {
		return "NewBook.jsp";
	}
	
	@PostMapping("/addbook")
	public String addBook(@RequestParam("title") String title, @RequestParam("description") String description, @RequestParam("language") String language, @RequestParam("pages") Integer pages) {
		this.bService.createBook(title, description, language, pages	);
		return "redirect:/";
	}
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bService.deleteBook(id);
    }
}
