package com.luciano.bookstoremanager.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.bookstoremanager.books.entity.Book;

public interface BooksRepository extends JpaRepository<Book, Long>{ 

}
