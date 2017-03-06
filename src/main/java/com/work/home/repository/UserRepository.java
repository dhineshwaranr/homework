package com.work.home.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.work.home.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUserName(String userName);
	public User save(User user);
	public User findById(Long userId);
	public List<User> findAll();
	
}
