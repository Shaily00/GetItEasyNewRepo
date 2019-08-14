package com.zensar.services.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.zensar.entities.User;
import com.zensar.services.business.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	
	@Autowired
	private UserService service;
	
	@PostMapping
	public String createUser(@RequestParam("userId") int userId,@RequestParam ("userName") String userName,
			
			@RequestParam("userContact") int userContact,
			@RequestParam("userEmail") String userEmail,
	         @RequestParam("userAddress") String userAddress)
	
	
	{
		User user = new User(userId, userName, userContact,userEmail, userAddress);
		service.createUser(user);
		return "User " + userId + "created succesfully" ;
		
	}
	
	@PutMapping
	public String editUser(@RequestBody User user)
	{
		service.editUser(user);
		return "User" + user.getUserId() + " edited succesfully";
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") int userId)
	{
		return service.findUserById(userId);
	}
	
	@DeleteMapping
	public String removeUser (@RequestBody User user)
	{
		service.removeUser(user);
		
		return "User" + user.getUserId() + "user removed";
	}
	
	/*
	 * @GetMapping("/count") public int getProductCount() { return
	 * service.findAllProducts().size(); }
	 */
	
	@GetMapping
	
	public List<User> getAllUsers()
	{
		return service.findAllUsers();
	}
	
}
