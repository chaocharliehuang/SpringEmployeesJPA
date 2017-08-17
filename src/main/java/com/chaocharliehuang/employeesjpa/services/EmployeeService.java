package com.chaocharliehuang.employeesjpa.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chaocharliehuang.employeesjpa.models.Employee;
import com.chaocharliehuang.employeesjpa.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public Employee findEmployeeById(Long id) {
		return employeeRepository.findOne(id);
	}
	
	public List<Employee> findEmployeesOfManager(Employee manager) {
		return manager.getEmployees();
	}
	
	public List<Employee> findManagersOfEmployee(Employee employee) {
		return employee.getManagers();
	}

}
