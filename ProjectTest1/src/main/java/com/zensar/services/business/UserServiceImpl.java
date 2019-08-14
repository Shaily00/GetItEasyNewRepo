package com.zensar.services.business;


/*
 * Author:Shaily Agrawal
 * Creation Date: 30th jul 2019 04.50 PM
 * Modified Date: 31th July 2019 04:50 PM
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Represents business entity product
 * It is impl of product service
 * value object of application
 * domain or application object.
 * It contains CRUD operations for entity product.
 * 
 **/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.zensar.dao.UserDao;

import com.zensar.entities.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserDao userDao;

	public void createUser(User user) {
		userDao.insertUser(user);
		// TODO Auto-generated method stub

	}

	public void editUser(User user) {
		User dbUser = findUserById(user.getUserId());
		if(dbUser!=null)
		{ 
			dbUser.setUserName(user.getUserName());
			dbUser.setUserContact(user.getUserContact());
			dbUser.setUserEmail(user.getUserEmail());
			
			dbUser.setUserAddress(user.getUserAddress());
			userDao.updateUser(dbUser);
		}
		else
			System.out.println("User doesnt exist");
		// TODO Auto-generated method stub

	}

	public void removeUser(User user) {
		User dbUser = findUserById(user.getUserId());
		if(dbUser!=null)
		{
			userDao.deleteUser(dbUser);
		}
		else
			System.out.println("User doesnt exist");

	}

	public User findUserById(int userId) {
		// TODO Auto-generated method stub
		return userDao.getByUserId(userId);
	}

	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

}
