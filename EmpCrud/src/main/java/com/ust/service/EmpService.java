package com.ust.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.model.Employee;
import com.ust.repo.EmpRepo;

@Service
public class EmpService {

	@Autowired
	public EmpRepo employeeRepository;

	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepository.save(emp);
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).orElse(null);
	}

	public Employee updateEmployees(Employee emp) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		Optional<Employee> updateEmployee = employeeRepository.findById(emp.getId());
		if (updateEmployee.isPresent()) {
			employee.setDomain(emp.getDomain());
			employee.setEmailId(emp.getEmailId());
			employee.setExperience(emp.getExperience());
			employee.setLocation(emp.getLocation());
			employee.setName(emp.getName());
			employee.setEmpId(emp.getEmpId());
		}
		else 
			return new Employee();
		employeeRepository.save(employee);
		return employee;
	}

	public String deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
		return "Employee " + id + " got deleted";
	}
}
