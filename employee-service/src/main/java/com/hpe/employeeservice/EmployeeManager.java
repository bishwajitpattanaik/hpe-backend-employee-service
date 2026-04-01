package com.hpe.employeeservice;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {

    private static Employees list = new Employees();

    static
    {
        Employee employee1 = new Employee(
                "001", "John", "Smith", "john@hpe.com", "Engineer");
        Employee employee2 = new Employee(
                "002", "Jane", "Doe", "jane@hpe.com", "Manager");
        Employee employee3 = new Employee(
                "003", "Bob", "Johnson", "bob@hpe.com", "DevOps");
        Employee employee4 = new Employee(
                "004", "Alice", "Brown", "alice@hpe.com", "Analyst");

        list.getEmployeeList().add(employee1);
        list.getEmployeeList().add(employee2);
        list.getEmployeeList().add(employee3);
        list.getEmployeeList().add(employee4);
    }

    public Employees getAllEmployees()
    {
        return list;
    }

    public void addEmployee(Employee employee)
    {
        list.getEmployeeList().add(employee);
    }
}