package com.baracho.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baracho.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
