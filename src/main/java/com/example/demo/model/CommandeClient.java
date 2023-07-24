package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class CommandeClient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCommandeClient;

	@Column(name="refCommande", unique = true)
	private String refCommande;
	@Column(name="dateCommande")
	private Date dateCommande;
	@Column(name="prixProduitTot")
	private double prixProduitTot;
	@Enumerated(EnumType.STRING)
	private EtatCommande etatCommande;
	
	@OneToMany(mappedBy = "commandeClient")
	private List< LigneCmmandeClient> ligneCommandeClient;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	@Column(name="descriptionP" )
	private String descriptionP;
	
}


