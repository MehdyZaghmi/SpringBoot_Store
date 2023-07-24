package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.WishList;

public interface WishListRepository extends JpaRepository<WishList,Long> {

}
