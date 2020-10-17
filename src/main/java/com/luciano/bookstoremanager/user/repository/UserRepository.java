package com.luciano.bookstoremanager.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.bookstoremanager.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
