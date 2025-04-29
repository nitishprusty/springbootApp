package com.example.crudApp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Emp_Data")
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    @Column
    private String emp_name;
    @Column
    private float salary;


    public Employee() {
    }


    public Employee(int emp_id, String emp_name, float salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.salary = salary;
    }


    public int getEmp_id() {
        return emp_id;
    }


    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }


    public String getEmp_name() {
        return emp_name;
    }


    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }


    public float getSalary() {
        return salary;
    }


    public void setSalary(float salary) {
        this.salary = salary;
    }

    

    

    
}
