package com.example.hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Data 
@Entity 
@Table(name = "employers")
public class Employers extends User{
	@Id
	@GeneratedValue
	@Column(name="employer_id")
	private int employer_id; 
	@Column(name="company_name")
	private String company_name;
	@Column(name="phone")
	private String phone;
	@Column(name="website")
	private String website;
	public int getId() {
		return employer_id;
	}
	public void setId(int id) {
		this.employer_id = id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	
	

}
