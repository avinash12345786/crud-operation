package com.example.cruds.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.cruds.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	

}
