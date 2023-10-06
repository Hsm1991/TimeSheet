package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table( name = "Contrat")public class Contrat implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long reference;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	 
	private String typeContrat;
 
	@JsonIgnore
	@OneToOne(mappedBy="contrat")
	private Employe employe;

	private float salaire;


	

 
}
