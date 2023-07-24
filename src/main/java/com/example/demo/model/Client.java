package com.example.demo.model ;

import  lombok.AllArgsConstructor;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	@Column(name="nom" )
	private String nom;
	@Column(name="age" )

	private int age;
	@Column(name="CIN" , unique = true )

	private String CIN ;
	@Column(name="numCarteB" , unique = true )

	private String numCarteB;
	@Column(name="numTel" )

	private String numTel ;
	@Embedded 
	private Adresse adresse; 
	@Column(name="email" , unique = true )

	private String email; 
	@OneToMany(mappedBy = "client")
	private List<CommandeClient> comandeclient;



	

	
}
