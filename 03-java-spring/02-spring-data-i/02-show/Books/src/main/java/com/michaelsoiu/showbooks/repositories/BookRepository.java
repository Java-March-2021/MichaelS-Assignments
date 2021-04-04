package com.michaelsoiu.showbooks.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michaelsoiu.showbooks.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

}
