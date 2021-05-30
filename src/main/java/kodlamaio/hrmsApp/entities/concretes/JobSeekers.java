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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity //anatosyon yöntemi bir clasın çalışma anında derleme anında onunla ilgili bilgi topplamak için yapılan yapı ,burada diyoruz ki prodct bir etnitydir
@Table(name = "job_seekers")
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekers  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="j_id")
	private int id ;
	
	@Column(name="f_name")
	private String firstName;
	
	@Column(name="s_name")
	private String surname;
	
	@Column(name="national_id")
	private String nationalId;
	
	@Column(name="birth_date")
	private int birthDate;
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = JobSeekers.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "j_id", referencedColumnName = "user_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Users user;

	

}