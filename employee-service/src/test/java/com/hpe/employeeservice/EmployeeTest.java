package com.hpe.employeeservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void testEmployeeConstructor()
    {
        Employee employee = new Employee(
                "001", "John", "Smith", "john@hpe.com", "Engineer");

        assertNotNull(employee);
    }

    @Test
    public void testGetEmployee_id()
    {
        Employee employee = new Employee(
                "001", "John", "Smith", "john@hpe.com", "Engineer");

        assertEquals("001", employee.getEmployee_id());
    }

    @Test
    public void testGetFirst_name()
    {
        Employee employee = new Employee(
                "001", "John", "Smith", "john@hpe.com", "Engineer");

        assertEquals("John", employee.getFirst_name());
    }

    @Test
    public void testGetLast_name()
    {
        Employee employee = new Employee(
                "001", "John", "Smith", "john@hpe.com", "Engineer");

        assertEquals("Smith", employee.getLast_name());
    }

    @Test
    public void testGetEmail()
    {
        Employee employee = new Employee(
                "001", "John", "Smith", "john@hpe.com", "Engineer");

        assertEquals("john@hpe.com", employee.getEmail());
    }

    @Test
    public void testGetTitle()
    {
        Employee employee = new Employee(
                "001", "John", "Smith", "john@hpe.com", "Engineer");

        assertEquals("Engineer", employee.getTitle());
    }

    @Test
    public void testSetEmployee_id()
    {
        Employee employee = new Employee(
                "001", "John", "Smith", "john@hpe.com", "Engineer");
        employee.setEmployee_id("999");

        assertEquals("999", employee.getEmployee_id());
    }

    @Test
    public void testSetFirst_name()
    {
        Employee employee = new Employee(
                "001", "John", "Smith", "john@hpe.com", "Engineer");
        employee.setFirst_name("Jane");

        assertEquals("Jane", employee.getFirst_name());
    }

    @Test
    public void testToString()
    {
        Employee employee = new Employee(
                "001", "John", "Smith", "john@hpe.com", "Engineer");

        String result = employee.toString();
        assertTrue(result.contains("001"));
        assertTrue(result.contains("John"));
    }
}