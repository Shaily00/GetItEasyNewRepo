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

import com.zensar.entities.LogIn;
import com.zensar.services.business.LogInService;



@RestController
@RequestMapping("/logins")
public class LoginResource {
	
	
	@Autowired
	private LogInService logInService;
	
	
	@PostMapping
	public String createLogin(@RequestParam("logInId") int logInId,@RequestParam ("name") String name,
			
			@RequestParam("password") String password
			)
	
	{
		
		LogIn logIn = new LogIn(logInId, name, password);
		logInService.createLogin(logIn);
		return "Login " + logInId + "created succesfully" ;
		
	}
	
	@PutMapping
	public String editLogin(@RequestBody LogIn logIn)
	{
		logInService.editLogin(logIn);
		return "Login" + logIn.getlogInId() + " edited succesfully";
	}
	
	@GetMapping("/{id}")
	public LogIn getLogIn(@PathVariable("id") int logInId)
	{
		return logInService.findLoginById(logInId);
	}
	
	@DeleteMapping
	public String removeLogin (@RequestBody LogIn logIn)
	{
		logInService.removeLogin(logIn);
		
		return "Login" + logIn.getlogInId() + "login removed";
	}
	
	/*
	 * @GetMapping("/count") public int getProductCount() { return
	 * service.findAllProducts().size(); }
	 */
	
	@GetMapping
	
	public List<LogIn> getAllLogIns()
	{
		return logInService.findAllLogIns();
	}
	

}