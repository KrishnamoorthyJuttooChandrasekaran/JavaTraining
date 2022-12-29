package com.ust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.model.Employee;
import com.ust.service.EmpService;

@RestController
@RequestMapping("api/employee")
public class EmpController {

	@Autowired
	private EmpService service;

	@PostMapping("/register")
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.createEmployee(emp);
	}

	@GetMapping("/ust/employees")
	public List<Employee> getAllEmployees() {
		return service.getEmployees();
	}

	@GetMapping("/ust/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}

	@PutMapping("/update/employee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployees(emp);
	}

	@DeleteMapping("/delete/employee/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		return service.deleteEmployeeById(id);
	}
}
