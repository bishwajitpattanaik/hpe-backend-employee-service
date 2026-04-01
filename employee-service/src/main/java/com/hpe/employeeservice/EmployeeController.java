package com.hpe.employeeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    @GetMapping(path = "/", produces = "application/json")
    public Employees getEmployees()
    {
        return employeeManager.getAllEmployees();
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public Employees addEmployee(@RequestBody Employee employee)
    {
        employeeManager.addEmployee(employee);
        return employeeManager.getAllEmployees();
    }
}
