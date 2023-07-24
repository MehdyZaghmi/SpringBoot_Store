package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data// au lieu de getters et setters (genere auto)
@Builder// pour l'instance
@NoArgsConstructor//constructeur non paramétré
@AllArgsConstructor
@Entity
@Table
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idStock;
	@OneToMany(mappedBy="stock",fetch = FetchType.EAGER)
	private List<CommandeAdminProduit> commandeAdminProduit;
	@Column(name="idProduit")
	private Long idProduit;
	
	@Column(name="quantite")
	private int quantite;
}

