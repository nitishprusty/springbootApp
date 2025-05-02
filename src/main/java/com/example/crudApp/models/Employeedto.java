package com.example.crudApp.models;
import jakarta.validation.constraints.NotNull;


public class Employeedto {
    @NotNull(message = "Name is required")
    private String emp_name;
    @NotNull(message = "This is a required Field")
    private float salary;
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
