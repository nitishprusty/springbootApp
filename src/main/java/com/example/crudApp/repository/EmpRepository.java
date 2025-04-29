package com.example.crudApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudApp.models.Employee;

public interface EmpRepository extends JpaRepository<Employee,Integer> {
    
}
