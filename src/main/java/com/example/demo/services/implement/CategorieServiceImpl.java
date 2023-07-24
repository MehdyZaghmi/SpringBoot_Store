package com.example.demo.services.implement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CategorieDTO;
import com.example.demo.model.Categorie;
import com.example.demo.repositories.CategorieRepository;
import com.example.demo.services.CategorieService;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class CategorieServiceImpl implements CategorieService {
	@Autowired
	private final CategorieRepository categorieRepo;
	

	public CategorieServiceImpl(CategorieRepository categorieRepo) {
		super();
		this.categorieRepo = categorieRepo;
	}

	@Override
	public Categorie findCategorieById(Long id) {
		Optional<Categorie> optianlCat=categorieRepo.findById(id);
		if(optianlCat.isPresent()) {
			return optianlCat.get();
		}else {
			return null;// Throw Exception
			
		}
		
	}

	@Override
	public List<CategorieDTO> findAllCategories() {
		List<Categorie> x=categorieRepo.findAll();
		List<CategorieDTO> xDTO= new ArrayList<>();
		for(Categorie cat : x) {
			CategorieDTO catDTO =new CategorieDTO();
			
			
		}
		return null;
	}

	@Override
	public Categorie createCategorie(CategorieDTO cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie updateProductNumber(Long idCategorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie updateCategorie(Long id, CategorieDTO cat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void deleteCategorie(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
