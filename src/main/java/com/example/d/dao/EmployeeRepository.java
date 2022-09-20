package com.example.d.dao;


import com.example.d.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 * @author Dgryzhkov
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
