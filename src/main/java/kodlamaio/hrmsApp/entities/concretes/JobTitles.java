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
@Table(name = "job_titles")
@NoArgsConstructor
@AllArgsConstructor
public class JobTitles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_id")
	private int id ;
	
	@Column(name="job_name")
	private String jobName;
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = JobTitles.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "job_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private JobTitles jobtitle;

}
