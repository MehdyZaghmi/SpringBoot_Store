package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor//constructeur non paramétré
@AllArgsConstructor
public class CategorieDTO {
	
	private Long idCategorie;
	
	private String nomCategorie;
	
	private int nbrProduit;
	
}
