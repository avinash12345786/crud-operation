package com.example.cruds.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cruds.model.Employee;
import com.example.cruds.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	public List<Employee> getAllEmployee(){
		
		List <Employee> employee= new ArrayList<Employee>();
		employeeRepository.findAll();
		return employee;
		
		
		
	}
	public void save(Employee employee) {
		System.out.println("ok tested");
		employeeRepository.save(employee);
	}

}
