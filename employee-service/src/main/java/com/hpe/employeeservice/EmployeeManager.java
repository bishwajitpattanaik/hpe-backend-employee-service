package com.hpe.employeeservice;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {

    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        employees.addEmployee(new Employee(
                "001", "John", "Smith", "john@hpe.com", "Engineer"));
        employees.addEmployee(new Employee(
                "002", "Jane", "Doe", "jane@hpe.com", "Manager"));
        employees.addEmployee(new Employee(
                "003", "Bob", "Johnson", "bob@hpe.com", "DevOps"));
        employees.addEmployee(new Employee(
                "004", "Alice", "Brown", "alice@hpe.com", "Analyst"));
    }

    public Employees getEmployees() { return employees; }
}