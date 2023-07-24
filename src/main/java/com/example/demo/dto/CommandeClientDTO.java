package com.example.demo.dto;

import java.sql.Date;
import java.util.List;

import com.example.demo.model.Client;
import com.example.demo.model.EtatCommande;
import com.example.demo.model.LigneCmmandeClient;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
;

public class CommandeClientDTO {
	private Long idCommandeClient;

	private String refCommande;
	
	private Date dateCommande;
	
	private double prixProduitTot;
	
	@Enumerated(EnumType.STRING)
	private EtatCommande etatCommande;
	
	
	private Client client;
	
	private String descriptionP;
}
