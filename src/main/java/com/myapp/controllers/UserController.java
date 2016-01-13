package com.myapp.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myapp.entities.Employee;
import com.myapp.repositories.EmployeeRepository;
import com.myapp.utils.Utils;

@Controller
public class UserController {

	@PersistenceContext(name = "empPersistence")
	EntityManager em;

	// Test injecting EntityManager

	@Autowired
	private EmployeeRepository employeeRepository;

	// Check why the transaction manager is not injected to this entity manager
	// even after setting persistence unit name
	/*
	 * @PersistenceContext(unitName = "employeeUnit") EntityManager em;
	 */

	// for home page
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage() {
		System.out.println("in UserController homePage---------------------------");
		/*
		 * employeeRepository.save(new Employee("TEST1", "TEST",
		 * "Engineering"));
		 */
		return "home";
	}

	// for redirecting to user page
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUserGetReq() {
		return "addUser";
	}

	// insert new user to database
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("employee") Employee employee) {
		System.out.println("in UserController getUserSuccess-----------------------");
		System.out
				.println(employee.getFirstName() + " - " + employee.getLastName() + " - " + employee.getDesignation());
		employeeRepository.save(employee);

		ModelAndView model = new ModelAndView("addUser", "employee", new Employee());
		model.addObject("result", "User Added Successfully");

		return model;
	}

	@RequestMapping(value = "/listAllUsers", method = RequestMethod.GET)
	public ModelAndView getAllEmployees() {
		Iterable<Employee> iterable = employeeRepository.findAll();
		List<Employee> empList = (List<Employee>) Utils.toList(iterable);

		ModelAndView model = new ModelAndView("listAllUsers");
		model.addObject("empList", empList);
		model.addObject("name", "omkar");

		System.out.println("Size in getAllEmployees ------- " + empList.size());
		System.out.println(empList.get(0).getFirstName());
		return model;
	}
}
