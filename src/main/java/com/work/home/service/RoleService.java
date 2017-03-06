package com.work.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.home.entity.Authority;
import com.work.home.repository.RolesRepository;

@Service
public class RoleService {

	@Autowired
	private RolesRepository roleRepo;
	
	public Authority addRole(Authority role){
		Authority savedRole = roleRepo.save(role);
		return savedRole;
	}
	
}
