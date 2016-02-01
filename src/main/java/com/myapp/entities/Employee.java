package com.myapp.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.engine.internal.Cascade;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "fistName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "designation")
	private String designation;

	//@Column - If specified, will get error - @Column(s) not allowed on a @OneToOne property: com.myapp.entities.Employee.department
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)//by default fetchType EAGER for @OneToOne Mapping
	@JoinColumn(name = "deptId_FK")//Use @JoinColumn to name a foreign key column. Generally this can be ignored as a column with default name will be created
	private Department department;
	
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee() {

	}

	public Employee(String firstName, String lastName, String designation) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setDesignation(designation);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}