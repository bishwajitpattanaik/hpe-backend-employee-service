package com.hpe.employeeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public Employees getEmployees() {
        Employees employees = new Employees();
        employees.addEmployee(new Employee(
                "001", "John", "Smith", "john@hpe.com", "Engineer"));
        employees.addEmployee(new Employee(
                "002", "Jane", "Doe", "jane@hpe.com", "Manager"));
        employees.addEmployee(new Employee(
                "003", "Bob", "Johnson", "bob@hpe.com", "DevOps"));
        return employees;
    }
}