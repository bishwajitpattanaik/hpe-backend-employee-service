package com.hpe.employeeservice;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) { employees.add(e); }
    public List<Employee> getEmployees() { return employees; }
}