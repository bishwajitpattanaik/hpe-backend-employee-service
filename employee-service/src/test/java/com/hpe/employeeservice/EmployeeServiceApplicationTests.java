package com.hpe.employeeservice;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeServiceApplicationTests {

	@Mock
	private EmployeeManager employeeManager;

	int getEmployeeCount(EmployeeManager manager)
	{
		return manager.getAllEmployees().getEmployeeList().size();
	}

	@Test
	void createEmployeeManager()
	{
		EmployeeManager newEmployeeManager = new EmployeeManager();
		assert(getEmployeeCount(newEmployeeManager) != 0);
	}

	@Test
	void addEmployee()
	{
		EmployeeManager employeeManager = new EmployeeManager();
		int employeeCount = getEmployeeCount(employeeManager);
		Employee employee = new Employee(
				"005", "Mike", "Wilson", "mike@hpe.com", "Developer");
		employeeManager.addEmployee(employee);
		assert(employeeCount + 1 == getEmployeeCount(employeeManager));
	}

	@ExtendWith(MockitoExtension.class)
	@BeforeEach
	void setUp()
	{
		this.employeeManager = new EmployeeManager();
		Employee newEmployee = new Employee(
				"005", "Mike", "Wilson", "mike@hpe.com", "Developer");
		this.employeeManager.addEmployee(newEmployee);
	}

	@Test
	void employeeIdInList()
	{
		List<Employee> employees = this.employeeManager
				.getAllEmployees().getEmployeeList();
		for (int i = 0; i < employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getEmployee_id().equals("005"))
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	void employeeFirstNameInList()
	{
		List<Employee> employees = this.employeeManager
				.getAllEmployees().getEmployeeList();
		for (int i = 0; i < employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getFirst_name().equals("Mike"))
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	void employeeLastNameInList()
	{
		List<Employee> employees = this.employeeManager
				.getAllEmployees().getEmployeeList();
		for (int i = 0; i < employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getLast_name().equals("Wilson"))
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	void employeeEmailInList()
	{
		List<Employee> employees = this.employeeManager
				.getAllEmployees().getEmployeeList();
		for (int i = 0; i < employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getEmail().equals("mike@hpe.com"))
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	void employeeTitleInList()
	{
		List<Employee> employees = this.employeeManager
				.getAllEmployees().getEmployeeList();
		for (int i = 0; i < employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getTitle().equals("Developer"))
			{
				return;
			}
		}
		assert(false);
	}
}