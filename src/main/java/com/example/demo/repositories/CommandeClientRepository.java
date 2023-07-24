package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CommandeClient;

public interface CommandeClientRepository extends JpaRepository< CommandeClient,Long> {

}
