package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.PannierDTO;
import com.example.demo.model.Pannier;

public interface PannierService {
	List<PannierDTO> findAllPannier();
	Pannier findPannierById(Long id);
	Pannier findPannierByIdClient(Long idClient);
	Pannier orderItemsFromPannier(Long id,Pannier x/* , ItemsId*/);
	Pannier CreatePannier(Pannier x);
	Pannier updatePannier(Long id,Pannier x);
	Void deletePannier(Long id);
}
