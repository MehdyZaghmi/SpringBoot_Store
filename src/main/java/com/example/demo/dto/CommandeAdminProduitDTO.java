package com.example.demo.dto;

import java.math.BigDecimal;


import com.example.demo.model.CommandeAdmin;
import com.example.demo.model.Produit;



public class CommandeAdminProduitDTO {
	private Long idCommandeAdminProduit;

	private BigDecimal quantité;
	
	private BigDecimal prixUnit;
	

	private CommandeAdmin commandeAdmin ;
	
	private Produit produit ;
	
	
}
