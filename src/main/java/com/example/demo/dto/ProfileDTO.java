package com.example.demo.dto;

import com.example.demo.model.Adresse;
import com.example.demo.model.Role;

import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class ProfileDTO {

	private Long idProfile;
	private String nomUtilisateur;

	private String numCarteB;
	private String numTel ;
	@Embedded
	private Adresse adresse; 
	
	private String email; 
	
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Role role;
}
