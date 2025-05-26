package com.example.crudApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudApp.models.User;

public interface userRepository extends JpaRepository<User,Long> {

    Optional<User>  findByUsername(String username);
 
} 
