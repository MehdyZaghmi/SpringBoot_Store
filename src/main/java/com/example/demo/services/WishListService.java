package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.WishListDTO;
import com.example.demo.model.WishList;

public interface WishListService {
	List<WishListDTO>findAllWishList();
	WishList activateSpecialDiscoiunt();
	WishList findWishListById(Long id);
	WishList createWishList(WishList x);
	WishList updateWishList(Long id,WishList X);
	Void deleteWishList(Long id);
}
