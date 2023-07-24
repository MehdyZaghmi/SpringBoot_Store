package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.ProduitDTO;
import com.example.demo.model.Produit;

public interface ProduitService {
	List<ProduitDTO>findAllProduits();
	List<ProduitDTO>findAllProduitsInStock();
	Produit findProduitById(Long id);
	Produit addProduit(Produit x);
	Produit updateProduit(Long id,Produit x);
	Void deleteProduit(Long id);
}
