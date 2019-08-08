package com.zensar.dao;
import java.util.List;
import com.zensar.entities.LogIn;
public interface LogInDao {
	void insertLogIn(LogIn logIn);
	void updateLogIn(LogIn logIn);
	void deleteLogIn(LogIn logIn);
	LogIn getByIdLogIn(int logInId);
	List<LogIn> getAllLogIn(); 
}
