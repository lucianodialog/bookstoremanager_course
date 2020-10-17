package com.luciano.bookstoremanager.publisher.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.bookstoremanager.publisher.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long>{

}
