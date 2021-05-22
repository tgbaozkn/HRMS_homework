package com.example.hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data 
@Entity //anatosyon yöntemi bir clasın çalışma anında derleme anında onunla ilgili bilgi topplamak için yapılan yapı 
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int user_id ;
	
	@Column(name="email_address")
	private String email_address;
	
	@Column(name="password")
	private String password;
	
	@Column(name="password_again")
	private String password_again;
	@Column(name = "first_name")
	private String first_name;
	@Column(name="last_name")
	private String last_name;
	
	public User() {
		
	}

	public int getId() {
		return user_id;
	}

	public void setId(int id) {
		this.user_id = id;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword_again() {
		return password_again;
	}

	public void setPassword_again(String password_again) {
		this.password_again = password_again;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
}
