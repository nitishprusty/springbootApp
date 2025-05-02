package com.example.crudApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.crudApp.models.Employee;
import com.example.crudApp.models.Employeedto;
import com.example.crudApp.services.EmpServices;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
// @RequestMapping("/Employees")
public class EmployeeDataController {
    
    @Autowired
    private EmpServices empServices;

    @GetMapping({"","/"})
    public String ShowLandingPage() {
        return "/Employees/index";
    }
    
    @GetMapping({"/Employees/dashboard","/Employees/"})
    public String ShowEmpDetails(Model model,@Param(value = "keyword") String keyword) {
        List<Employee> emp = null;
        if (keyword != null) {
            emp = empServices.fetchEmployeeByName(keyword);
        } else {
            emp = empServices.fetchEmployees();
        }
        model.addAttribute("employees", emp);
        return "/Employees/employeeRecords";
    }

    @GetMapping("/Employees/create")
    public String showAddEmployeeRecordPage(Model model) {
        Employeedto employeedto = new Employeedto();
        model.addAttribute("employeedto", employeedto);
        return  "/Employees/create";
    }

    @PostMapping("/Employees/create")
    public String AddEmployeeDetails( @Valid @ModelAttribute Employeedto empdto, BindingResult result) {

        if (result.hasErrors()) {
            return "/Employees/create";
        }

        Employee emp = new Employee();
        emp.setEmp_name(empdto.getEmp_name());
        emp.setSalary(empdto.getSalary());

        empServices.saveEmployeeDetails(emp);
        
        return "redirect:/Employees/dashboard";
    }

    @GetMapping("/Employees/delete")
    public String deletedEmpRecords(@RequestParam int id,Model model) {
        try{
            Employee emp =  empServices.getEmpById(id);
            empServices.deleteEmployee(emp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "redirect:/Employees/dashboard";
    }

    @GetMapping("/Employees/update")
    public String fetchUpdateEmpPage(@RequestParam int id,Model model) {
        Employee emp = empServices.getEmpById(id);
        model.addAttribute("employeedto", emp);
        return "/Employees/update";
    }

    @PostMapping("/Employees/update")
    public String updateEmployee(@RequestParam int id,@ModelAttribute Employeedto empdto,BindingResult bindingresult, Model model) {
        Employee emp = empServices.getEmpById(id);
        emp.setEmp_name(empdto.getEmp_name());
        emp.setSalary(empdto.getSalary());

        empServices.saveEmployeeDetails(emp);

        return "redirect:/Employees/dashboard";
    }
}
