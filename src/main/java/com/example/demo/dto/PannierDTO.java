package com.example.demo.dto;

import java.util.Map;

import com.example.demo.model.Produit;
import com.example.demo.model.Profile;


public class PannierDTO {
	private Long idPannier;
	//hors conception
	private Profile profile;

	private Map<Produit, Long> pannierProduit;
	
	private double prixTotal;
}
