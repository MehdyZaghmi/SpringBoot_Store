package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pannier;

public interface PannierRepository extends JpaRepository<Pannier,Long> {

}
