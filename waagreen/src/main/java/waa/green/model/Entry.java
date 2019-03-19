package waa.green.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Entry {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotBlank
	@Column(name="month_year")
	private String monthYear;
	
	
}
