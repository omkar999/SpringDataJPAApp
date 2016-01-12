package com.myapp.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myapp.entities.Employee;
import com.myapp.repositories.EmployeeRepository;

@Controller
public class UserController {
	
	@PersistenceContext(name ="empPersistence")
	EntityManager em;
	
	//Test injecting EntityManager

	@Autowired
	private EmployeeRepository employeeRepository;

	// Check why the transaction manager is not injected to this entity manager
	// even after setting persistence unit name
	/*
	 * @PersistenceContext(unitName = "employeeUnit") EntityManager em;
	 */

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage() {
		System.out.println("in UserController homePage---------------------------");
/*		employeeRepository.save(new Employee("TEST1", "TEST", "Engineering"));*/
		return "home";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("employee") Employee employee) {
		System.out.println("in UserController getUserSuccess-----------------------");
		System.out.println(employee.getFirstName() + " - " + employee.getLastName() + " - " + employee.getDesignation()  );
		employeeRepository.save(employee);
		return "user";
	}
}
