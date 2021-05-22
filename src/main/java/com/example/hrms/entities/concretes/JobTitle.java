package com.example.hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Data 
@Entity 
@Table(name = "job_titles")
public class JobTitle extends Employers{
	@Id
	@GeneratedValue
	@Column(name="jobt_id")
	private  int jobt_id;
	
	@Column(name="title")
	private String title;

}
