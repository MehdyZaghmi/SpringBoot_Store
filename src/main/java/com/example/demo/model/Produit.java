package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
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
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;
	@Column(name="nomProduit", unique = true)
	private String nomProduit;
	
	@Column(name="refProduit", unique = true)
	private String refProduit;
	
	@Column(name="prixProduitInit")
	private BigDecimal prixProduitInit;
	
	
	@Column(name="prixProduitVente")
	private BigDecimal prixProduitVente;
	
	@Column(name="TauxTVA")
	private BigDecimal TauxTVA;

	@Column(name="photo")
	private String photo;

	
	@Column(name="descriptionP" )
	private String descriptionP;
	//photo 
	
	
	
	@Enumerated(EnumType.STRING)
	private ProductRate pr;
	@ManyToOne
	@JoinColumn(name="idCategorie" , nullable = false)
	private Categorie categorie;
	
	@ManyToMany(mappedBy = "whishedProduit")
	private Set<WishList> wish;
	
	@ManyToMany(mappedBy = "pannier_produit")
	private Set<Pannier> pannier;
	
}
