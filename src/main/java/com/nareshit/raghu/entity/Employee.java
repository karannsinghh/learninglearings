package com.nareshit.raghu.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private Integer empId;
	private String empName;
	private Double empSal;
	private String empAddress;
	private String empDesignation;
	
}
