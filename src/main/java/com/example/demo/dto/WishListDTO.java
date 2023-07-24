package com.example.demo.dto;

import java.util.Map;

import com.example.demo.model.Produit;


public class WishListDTO {
private Long idWishList;
	
	
	private String prixTotal;
	
	private String quantiteItem;
	
	//onttoone with client
	
	private Map<Produit, Long> whishedProduit;
	
}
