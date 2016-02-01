package com.myapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myapp.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
