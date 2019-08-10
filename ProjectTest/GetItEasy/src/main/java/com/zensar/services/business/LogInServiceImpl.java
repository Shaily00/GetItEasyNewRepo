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

import com.zensar.dao.LogInDao;
import com.zensar.dao.ProductDao;
import com.zensar.entities.LogIn;
import com.zensar.entities.Product;

@Service
@Transactional
public class LogInServiceImpl implements LogInService {
	
	
	@Autowired
	private LogInDao logInDao;

	public void createLogin(LogIn logIn) {
		logInDao.insertLogIn(logIn);
		// TODO Auto-generated method stub

	}

	public void editLogin(LogIn logIn) {
		LogIn dbLogIn = findLoginById(logIn.getlogInId());
		if(dbLogIn!=null)
		{ 
			dbLogIn.setName(logIn.getName());
			
			dbLogIn.setPassword(logIn.getPassword());
			logInDao.updateLogIn(dbLogIn);
		}
		else
			System.out.println("Login doesnt exist");
		// TODO Auto-generated method stub

	}

	public void removeLogin(LogIn logIn) {
		LogIn dbLogIn = findLoginById(logIn.getlogInId());
		if(dbLogIn!=null)
		{
			logInDao.deleteLogIn(dbLogIn);
		}
		else
			System.out.println("Entry doesnt exist");

	}

	public LogIn findLoginById(int logInId) {
		// TODO Auto-generated method stub
		return logInDao.getByIdLogIn(logInId);
	}

	public List<LogIn> findAllLogIns() {
		// TODO Auto-generated method stub
		return logInDao.getAllLogIn();
	}

	

	


}

