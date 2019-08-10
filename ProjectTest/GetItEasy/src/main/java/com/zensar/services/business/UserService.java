package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.User;

public interface UserService {
	/*
	 * Author:Shaily Agrawal
	 * Creation Date: 30th jul 2019 15.05 PM
	 * Modified Date: 30th July 2019 15:10 PM
	 * Version: 3.0
	 * Copyright: Zensar Technologies. All rights reserved.
	 * Description: Represents business entity User
	 * It is interface of User services
	 * value object of application
	 * domain or application object.
	 *which can be accessed by presentation layer
	 *It encapsulates business logic of User entity
	 * 
	 **/
	
		void createUser(User user);
		void editUser(User user);
		void removeUser(User user);
		User findUserById(int userId);
		List<User> findAllUsers();
		
		
}
