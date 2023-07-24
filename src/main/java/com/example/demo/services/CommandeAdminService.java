package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.CommandeAdminDTO;
import com.example.demo.model.CommandeAdmin;

public interface CommandeAdminService {

	List<CommandeAdminDTO> findAllCommandeAdmin();
	CommandeAdmin findCommandeAdminById(Long id);
	CommandeAdmin addCommandeAdmin(CommandeAdmin x);
	CommandeAdmin updateCommandeAdmin(Long id,CommandeAdmin x);
	Void deleteCommandeAdmin(Long id);
}
