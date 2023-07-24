package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.CategorieDTO;
import com.example.demo.model.Categorie;

public interface CategorieService {
	Categorie findCategorieById(Long id);
	List<CategorieDTO> findAllCategories();
	Categorie createCategorie(CategorieDTO cat);
	Categorie updateProductNumber(Long idCategorie);
	Categorie updateCategorie(Long id,CategorieDTO cat);
	Void deleteCategorie(Long id);
	
	
}
