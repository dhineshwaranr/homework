package com.work.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.work.home.entity.Authority;

@Repository
public interface RolesRepository extends JpaRepository<Authority, Integer> {
	
	public Authority save(Authority role);

}
