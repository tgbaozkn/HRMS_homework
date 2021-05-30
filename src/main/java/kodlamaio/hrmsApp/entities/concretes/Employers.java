package kodlamaio.hrmsApp.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity //anatosyon yöntemi bir clasın çalışma anında derleme anında onunla ilgili bilgi topplamak için yapılan yapı ,burada diyoruz ki prodct bir etnitydir
@Table(name = "employers")
@NoArgsConstructor
@AllArgsConstructor
public class Employers  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="e_id")
	private int id ;
	
	@NotNull
	@Column(name="company_name")
	private String companyName;
	
	@NotNull
	@Column(name="website")
	private String website;
	
	@NotNull
	@Column(name="phone")
	private String phone;
	
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Employers.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "e_id", referencedColumnName = "user_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Users user;
	

}