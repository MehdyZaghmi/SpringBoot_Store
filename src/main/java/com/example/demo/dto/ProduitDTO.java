package com.example.demo.dto;

import java.math.BigDecimal;
import java.util.Set;

import com.example.demo.model.Categorie;
import com.example.demo.model.Pannier;
import com.example.demo.model.ProductRate;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class ProduitDTO {

	private Long idProduit;
	
	private String nomProduit;
	
	
	private String refProduit;
	
	
	private BigDecimal prixProduitInit;
	
	
	
	private BigDecimal prixProduitVente;
	
	private BigDecimal TauxTVA;

	private String photo;

	
	private String descriptionP;
	//photo 
	
	
	
	@Enumerated(EnumType.STRING)
	private ProductRate pr;
	
	private CategorieDTO categorie;
	
	private Set<WishListDTO> wish;
	
	private Set<PannierDTO> pannier;
}
