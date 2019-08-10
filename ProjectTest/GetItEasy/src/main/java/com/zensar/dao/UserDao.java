package com.zensar.dao;
import java.util.List;
import com.zensar.entities.User;
public interface UserDao
{
	void insertUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	User getByUserId(int userId);
	List<User> getAllUser(); 
}
