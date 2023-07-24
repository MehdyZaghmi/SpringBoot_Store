package com.example.demo.dto;

import com.example.demo.model.Adresse;

import jakarta.persistence.Embedded;

public class FournisseurDTO {
	private Long idFournisseur;
	
	private String nomSociete;
	
	private String CIN ;
	
	private String numRIB;
	
	private String numTel ;
	
	@Embedded
	private Adresse adresse; 
	
	private String email; 
	
}
