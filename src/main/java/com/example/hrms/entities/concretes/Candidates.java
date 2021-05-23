package com.example.hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Data 
@Entity 
@Table(name = "candidates")
public class Candidates extends User{
	
	@Id
	@GeneratedValue
	@Column(name="candidates_id")
	private int candidates_id;
	
	@Column(name="birthdate")
	private String birthdate;
	
	@Column(name="nationalIdentity")
	private String nationalIdentity;

	
}
