package com.example.crudApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudApp.models.Employee;
import com.example.crudApp.repository.EmpRepository;

@Service
public class EmpServices {
    
    @Autowired
    private EmpRepository empRepository;
    
    public Employee saveEmployeeDetails(Employee emp) {
        return empRepository.save(emp);
    }

    public List<Employee> fetchEmployees() {
        List<Employee> allEmp = null;
        allEmp = empRepository.findAll();
        return allEmp;  
    }

    public String deleteEmployee(Employee emp) {
        empRepository.delete(emp);
        return "Deleted Successfully";
    }

    public Employee getEmpById(int id) {
        Employee emp = empRepository.findById(id).get();
        return emp;
    }

    public List<Employee> fetchEmployeeByName(String Name) {
        List<Employee> emplist = empRepository.searchByName(Name);
        return emplist;
    }

    // comment
}
