package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.LogIn;

public interface LogInService {
	
	void createLogin(LogIn logIn);
	void editLogin(LogIn logIn);
	void removeLogin(LogIn logIn);
	LogIn findLoginById(int logInId);
	List<LogIn> findAllLogIns();

}