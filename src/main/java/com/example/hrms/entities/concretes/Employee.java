package com.example.hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data 
@Entity 
@Table(name = "employee")
public class Employee extends User {
	@Id
	@GeneratedValue
	@Column(name="employee_id")
	private int employee_id ; 
		




	}


