package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LigneCmmandeClient;

public interface LigneCommandeClientRepository extends JpaRepository<LigneCmmandeClient,Long> {

}
