package com.example.crudApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.crudApp.models.Employee;

public interface EmpRepository extends JpaRepository<Employee,Integer> {

    @Query("SELECT e FROM Employee e WHERE e.emp_name LIKE %?1%")
    List<Employee> searchByName(String keyword);
}
