package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.StockDTO;
import com.example.demo.model.Stock;

public interface StockService {
	List<StockDTO>findAllStock();
	List<StockDTO>findAllStockNotReptured();
	Stock findStockById(Long id);
	Stock addStock(Stock x);
	Stock updateStock(Long id,Stock x);
	Void deleteStock(Long id);
}
