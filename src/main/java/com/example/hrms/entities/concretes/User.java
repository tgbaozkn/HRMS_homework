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
	
	
	
}
