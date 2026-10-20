package com.workforce;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private final Employees employees;
    
    public EmployeeManager(){
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Amrit", "Mann", 
                                        "amrit.mann@email.com", "Teacher"));
        
        employeeList.add(new Employee(2, "Gurpreet", "Singh", 
                                        "gurpreet.singh@email.com", "Coordinator"));
        
        employeeList.add(new Employee(3, "Priya", "Rani", 
                                        "priya.rani@email.com", "Substitute Teacher"));
        
        employees = new Employees(employeeList);
    }

    public Employees getEmployees(){
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.getEmployees().add(employee);
    }
}
