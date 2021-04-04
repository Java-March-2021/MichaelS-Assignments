package com.michaelsoiu.showbooks.services;

import org.springframework.stereotype.Service;

import com.michaelsoiu.showbooks.models.Book;
import com.michaelsoiu.showbooks.repositories.BookRepository;

@Service
public class BookService {
	private BookRepository bRepo;
	public BookService(BookRepository repo) {
		this.bRepo = repo;
	}
	
	public Book getOneBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	
	public Book createBook(Book newBook) {
		return this.bRepo.save(newBook);
	}
}
