package com.baracho.user.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baracho.user.entities.User;
import com.baracho.user.repository.UserRepository;

@RestController
@RequestMapping(name = "/users")
public class UserResource {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		
		User obj = userRepository.findById(id).get();
		return ResponseEntity.ok(obj);
		
		
	}
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){
		User obj = userRepository.findByEmail(email);
		
		return ResponseEntity.ok(obj);
	}

}
