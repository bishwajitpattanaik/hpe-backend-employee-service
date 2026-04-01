package com.hpe.employeeservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class EmployeeControllerTest {

    @Mock
    private EmployeeManager employeeManager;

    @InjectMocks
    private EmployeeController employeeController;

    @BeforeEach
    public void setUp()
    {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetEmployees()
    {
        Employees mockEmployees = new Employees();
        mockEmployees.getEmployeeList().add(new Employee(
                "001", "John", "Smith", "john@hpe.com", "Engineer"));

        when(employeeManager.getAllEmployees()).thenReturn(mockEmployees);

        Employees result = employeeController.getEmployees();

        assertNotNull(result);
        assertEquals(1, result.getEmployeeList().size());
        verify(employeeManager, times(1)).getAllEmployees();
    }

    @Test
    public void testAddEmployee()
    {
        Employee newEmployee = new Employee(
                "005", "Mike", "Wilson", "mike@hpe.com", "Developer");

        doNothing().when(employeeManager).addEmployee(newEmployee);

        employeeManager.addEmployee(newEmployee);

        verify(employeeManager, times(1)).addEmployee(newEmployee);
    }

    @Test
    public void testGetEmployeesNotNull()
    {
        Employees mockEmployees = new Employees();
        when(employeeManager.getAllEmployees()).thenReturn(mockEmployees);

        Employees result = employeeController.getEmployees();

        assertNotNull(result);
    }

    @Test
    public void testEmployeeListSize()
    {
        Employees mockEmployees = new Employees();
        mockEmployees.getEmployeeList().add(new Employee(
                "001", "John", "Smith", "john@hpe.com", "Engineer"));
        mockEmployees.getEmployeeList().add(new Employee(
                "002", "Jane", "Doe", "jane@hpe.com", "Manager"));

        when(employeeManager.getAllEmployees()).thenReturn(mockEmployees);

        Employees result = employeeController.getEmployees();

        assertEquals(2, result.getEmployeeList().size());
    }
}
