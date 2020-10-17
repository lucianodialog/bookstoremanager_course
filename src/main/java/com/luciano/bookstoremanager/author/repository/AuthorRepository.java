package com.luciano.bookstoremanager.author.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.bookstoremanager.author.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
