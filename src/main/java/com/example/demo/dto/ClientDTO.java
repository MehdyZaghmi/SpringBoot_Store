package com.example.demo.dto;

import com.example.demo.model.Adresse;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;

public class ClientDTO {
	private Long idClient;
	private String nom;
	

	private int age;
	

	private String CIN ;
	

	private String numCarteB;


	private String numTel ;
	@Embedded
	private Adresse adresse; 


	private String email; 
}
