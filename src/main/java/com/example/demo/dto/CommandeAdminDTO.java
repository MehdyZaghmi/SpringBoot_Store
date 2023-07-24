package com.example.demo.dto;

import java.sql.Date;


import com.example.demo.model.EtatCommande;
import com.example.demo.model.Fournisseur;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;


public class CommandeAdminDTO {
	private Long idCommandeAdmin;

	private String refCommandeAdmin;
	
	private Date dateCommandeAdmin;
	
	private double prixProduitTot;
	
	@Enumerated(EnumType.STRING)
	private EtatCommande etatCommandeAdmin;

	
	private Fournisseur fournisseur;
	
	private String descriptionP;
}
