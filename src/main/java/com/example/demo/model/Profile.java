package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProfile;
	@Column(name="nomUtilisateur", unique = true)
	private String nomUtilisateur;

	@Column(name="numCarteB" ,unique = true)
	private String numCarteB;
	@Column(name="numTel")
	private String numTel ;
	@Embedded
	private Adresse adresse; 
	@Column(name="email", unique = true)
	private String email; 
	@Column(name="password")
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Role role;
}
