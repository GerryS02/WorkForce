package com.workforce;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeManager.addEmployee(employee);
        
        return employee;
    }
    
}
