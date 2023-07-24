package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.FournisseurDTO;
import com.example.demo.model.Fournisseur;

public interface FournisseurService {
	List<FournisseurDTO> findAllFournisseurs();
	Fournisseur findFournisseurById(Long id);
	Fournisseur CreateFournisseur(Fournisseur x);
	Fournisseur updateFournisseur(Long id, Fournisseur x);
	Void deleteFournisseur(Long id);
}
