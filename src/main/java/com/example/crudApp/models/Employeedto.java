package com.example.crudApp.models;
import jakarta.validation.constraints.NotNull;


public class Employeedto {

    @NotNull(message = "Name is required")
    private String emp_name;
    @NotNull(message = "This is a required Field")
    private float salary;
    @NotNull(message = "This is a required Field")
    private String emp_email;
    @NotNull(message = "This is a required Field")
    private String emp_Address;
    @NotNull(message = "This is a required Field")
    private String emp_phoneNo;
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
    public String getEmp_email() {
        return emp_email;
    }
    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }
    public String getEmp_Address() {
        return emp_Address;
    }
    public void setEmp_Address(String emp_Address) {
        this.emp_Address = emp_Address;
    }
    public String getEmp_phoneNo() {
        return emp_phoneNo;
    }
    public void setEmp_phoneNo(String emp_phoneNo) {
        this.emp_phoneNo = emp_phoneNo;
    }
    


    
}
