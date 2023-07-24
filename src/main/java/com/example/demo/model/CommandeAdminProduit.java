package com.example.demo.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class CommandeAdminProduit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCommandeAdminProduit;

	@Column(name="quantité")
	private BigDecimal quantité;
	
	@Column(name="prixUnit")
	private BigDecimal prixUnit;
	

	@ManyToOne
	@JoinColumn(name="idCommandeAdmin")
	private CommandeAdmin commandeAdmin ;
	
	@ManyToOne
	@JoinColumn(name="idProduit")
	private Produit produit ;
	
	@ManyToOne
	@JoinColumn(name="idStock")
	private Stock stock;
	
	
}
