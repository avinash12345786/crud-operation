package com.example.cruds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cruds.model.Employee;
import com.example.cruds.service.EmployeeService;

@RestController

public class crudcontroller {
	@Autowired
	EmployeeService employeeservice;
	
	
	@GetMapping("/getemployee")
		private List<Employee> getAllEmployee(){
		return employeeservice.getAllEmployee();
	}
	@PostMapping("/insertemployee")
	private int insertEmployee(@RequestBody Employee employee) {
		employeeservice.save(employee);
		return employee.getEid();
	}
	
	
}
