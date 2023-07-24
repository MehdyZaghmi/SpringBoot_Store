package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CommandeAdmin;

public interface CommandeAdminRepository extends JpaRepository<CommandeAdmin,Long> {

}
