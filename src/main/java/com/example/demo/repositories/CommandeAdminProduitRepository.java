package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CommandeAdminProduit;

public interface CommandeAdminProduitRepository extends JpaRepository<CommandeAdminProduit,Long> {

}
