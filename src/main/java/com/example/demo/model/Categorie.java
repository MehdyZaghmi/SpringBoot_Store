package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Column;
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
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategorie;
	@Column(name="nomCategorie", unique = true)
	private String nomCategorie;

	@Column(name="nbrProduit" )
	private int nbrProduit;
	
@OneToMany(mappedBy = "categorie")
private List<Produit> produit;

}
