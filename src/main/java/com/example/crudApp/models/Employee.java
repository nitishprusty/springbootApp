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
    @Column
    private String emp_email;
    @Column
    private String emp_Address;
    @Column
    private String emp_phoneNo;

    public Employee(String emp_name, float salary, String emp_email, String emp_Address, String emp_phoneNo) {
        this.emp_name = emp_name;
        this.salary = salary;
        this.emp_email = emp_email;
        this.emp_Address = emp_Address;
        this.emp_phoneNo = emp_phoneNo;
    }

    public Employee() {
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
