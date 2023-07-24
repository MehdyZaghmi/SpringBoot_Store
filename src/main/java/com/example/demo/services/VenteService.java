package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.VenteDTO;
import com.example.demo.model.Vente;

public interface VenteService {
	List<VenteDTO>findAllVentes();
	Vente findVenteById(Long id);
	Vente addVente(Vente x);
	Vente updateVente(Long id,Vente x);
	Void deleteVente(Long id);
}
