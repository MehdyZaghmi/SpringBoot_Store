package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Stock;

public interface StockRepository extends JpaRepository<Stock,Long> {

}
