package com.workforce;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController 
public class EmployeeController {
    
    private final EmployeeManager employeeManager;

    public EmployeeController(){
        this.employeeManager = new EmployeeManager();
    }

    @GetMapping("/employees")
    public Employees getEmployees() {
        return employeeManager.getEmployees();
    }
    
}
