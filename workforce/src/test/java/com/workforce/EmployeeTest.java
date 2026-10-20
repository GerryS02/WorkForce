package com.workforce;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
    
    @Test 
    void employeeStoresAndReturnAllFields(){
        Employee e = new Employee(4, "amanpreet", "kaur", 
                                    "amanpreet.kaur@email.com", "Principal");

        assertEquals(5, e.getEmployee_id());
        assertEquals("amanpreet", e.getFirst_name());
        assertEquals("kaur", e.getLast_name());
        assertEquals("amanpreet.kaur@email.com", e.getEmail());
        assertEquals("Principal", e.getTitle());
    }

    @Test 
    void managerInitializesEmployeeList(){
        EmployeeManager manager = new EmployeeManager();

        assertNotNull(manager.getEmployees());
        assertEquals(5, manager.getEmployees().getEmployees().size());
    }

    @Test 
    void managerAddsNewEmployee(){
        EmployeeManager manager = new EmployeeManager();

        Employee e = new Employee(4, "amanpreet", "kaur", 
                                    "amanpreet.kaur@email.com", "Principal");

        manager.addEmployee(e);

        assertEquals(5, manager.getEmployees()
                               .getEmployees().size());

        assertTrue(manager.getEmployees()
                          .getEmployees().contains(e));
    }

     @Test
    void controllerReturnsEmployeesAndAddsNewEmployee() {
        EmployeeController controller = new EmployeeController();

        Employees initialEmployees = controller.getEmployees();
        int initialCount = initialEmployees.getEmployees().size();

        Employee employee = new Employee(4, "amanpreet", "kaur", 
                                    "amanpreet.kaur@email.com", "Principal");

        Employee addedEmployee = controller.addEmployee(employee);

        assertSame(employee, addedEmployee);

        assertEquals(
            initialCount + 1,
            controller.getEmployees().getEmployees().size()
        );

        assertTrue(
            controller.getEmployees()
                      .getEmployees().contains(employee)
        );
    }
}
