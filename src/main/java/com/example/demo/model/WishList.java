package com.example.demo.model;

import java.util.Map;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
public class WishList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idWishList;
	
	
	@Column(name="prixTotal")
	private String prixTotal;
	
	@Column(name="quantiteItem")
	private String quantiteItem;
	
	//onttoone with client
	
	@ManyToMany
	@JoinTable(name="whishlist_produit",joinColumns=@JoinColumn(name="whishList_id"),inverseJoinColumns = @JoinColumn(name="produit_id"))
	private Map<Produit, Long> whishedProduit;
	
	
}
