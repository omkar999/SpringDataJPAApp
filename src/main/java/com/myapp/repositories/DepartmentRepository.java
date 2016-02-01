/**
 * 
 */
package com.myapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.entities.Department;

/**
 * @author oputtagunta
 *
 */
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
