package com.nareshit.raghu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nareshit.raghu.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
