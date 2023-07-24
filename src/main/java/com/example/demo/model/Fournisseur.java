package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data// au lieu de getters et setters (genere auto)
@Builder// pour l'instance
@NoArgsConstructor//constructeur non paramétré
@AllArgsConstructor
@Entity
@Table
public class Fournisseur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFournisseur;
	@Column(name="nomSociete"  )

	private String nomSociete;
	@Column(name="CIN"  )

	private String CIN ;
	@Column(name="numRIB" , unique = true  )

	private String numRIB;
	@Column(name="numTel" , unique = true )
	
	private String numTel ;
	
	@Embedded
	private Adresse adresse; 
	
	@Column(name="email" , unique = true )
	private String email; 
	
}
