package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class Vente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVente;
	
	
	@Column(name="refVente", unique = true)
	private String refVente;
	@Column(name="dateVente")
	private Date dateVente;
	@OneToMany(mappedBy = "vente")
	private List<LigneCmmandeClient> ligneCommandeClient;
	@ManyToOne
	@JoinColumn(name="idStock")
	private Stock stock;
	


	
}