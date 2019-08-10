package com.zensar.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.zensar.entities.User;
@Repository
public class UserDaoImpl implements UserDao
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void insertUser(User user)
	{
		hibernateTemplate.save(user);		
	}

	public void updateUser(User user) 
	{
		hibernateTemplate.update(user);
	}

	public void deleteUser(User user) 
	{
		hibernateTemplate.delete(user);
	}

	public User getByUserId(int userId)
	{
		return hibernateTemplate.get(User.class, userId);
	}

	public List<User> getAllUser()
	{
		return hibernateTemplate.loadAll(User.class);
	}

}

	


	
