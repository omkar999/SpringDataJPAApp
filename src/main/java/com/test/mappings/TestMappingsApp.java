package com.test.mappings;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myapp.config.AppConfig;
import com.myapp.entities.Department;
import com.myapp.entities.Employee;
import com.myapp.repositories.EmployeeRepository;

public class TestMappingsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();

		oneToOne(ctx);

	}

	private static void oneToOne(AnnotationConfigApplicationContext ctx) {
		EmployeeRepository empRepo = ctx.getBean(EmployeeRepository.class);
		Employee emp = new Employee("omkar", "puttagunta", "Senior Software Engineer");
		Department dept = new Department("Technology");
		emp.setDepartment(dept);
		empRepo.save(emp);

	}

}
