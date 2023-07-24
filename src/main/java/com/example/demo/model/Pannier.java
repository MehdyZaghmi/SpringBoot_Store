package com.example.demo.model;

import java.util.Map;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class Pannier {

	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPannier;
	//hors conception
	@OneToOne()
	@JoinColumn(name = "idProfile",nullable = true)
	private Profile profile;

	@ManyToMany
	@JoinTable(name="pannier_produit",joinColumns= @JoinColumn(name="pannier_id"),inverseJoinColumns = @JoinColumn(name="produit_id"))
	private Map<Produit, Long> pannierProduit;
	@Column(name="prixTotal")
	private double prixTotal;
	
	
}
