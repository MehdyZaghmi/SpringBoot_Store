package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class LigneCmmandeClient {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idLigneCmmandeClient;
 @ManyToOne(fetch = FetchType.LAZY)
 @JoinColumn(name="idPannier" , nullable = false)
 private Pannier pannier;
 @ManyToOne(fetch = FetchType.LAZY)
 @JoinColumn(name="idCommandeClient" , nullable = false)
 private CommandeClient commandeClient;
 @ManyToOne(fetch = FetchType.LAZY)
 @JoinColumn(name="idVente")
 private Vente vente ;
 
 @Column(name="status")
 private Boolean status;
  
}
