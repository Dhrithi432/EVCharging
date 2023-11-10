package com.group1.evcharging.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group1.evcharging.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUsername(String username);
}
