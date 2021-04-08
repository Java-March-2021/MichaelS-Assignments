package com.michaelsoiu.showbooks.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelsoiu.showbooks.models.Book;
import com.michaelsoiu.showbooks.repositories.BookRepository;

@Service
public class BookService {
	private BookRepository bRepo;
	public BookService(BookRepository repo) {
		this.bRepo = repo;
	}
	
	public Book createBook(String title, String description, String language, Integer pages) {
		Book newBook = new Book(title, description, language, pages);
		return this.bRepo.save(newBook);
	}
	public List<Book> allBooks() {
		return this.bRepo.findAll();
	}
	
	public Book getOneBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	
	public Book createBook(Book newBook) {
		return this.bRepo.save(newBook);
	}
	
	public Book updateBook(Long id, Book updatedBook) {
		return this.bRepo.save(updatedBook);
	}
	
	public void deleteBook(Long id) {
		this.bRepo.deleteById(id);
	}

}
