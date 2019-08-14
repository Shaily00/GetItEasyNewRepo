package com.zensar.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.zensar.entities.LogIn;

@Repository
public class LogInDaoImpl implements LogInDao 
{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void insertLogIn(LogIn logIn)
	{
		hibernateTemplate.save(logIn);		
	}

	public void updateLogIn(LogIn logIn) 
	{
		hibernateTemplate.update(logIn);
	}

	public void deleteLogIn(LogIn logIn) 
	{
		hibernateTemplate.delete(logIn);
	}

	public LogIn getByIdLogIn(int logInId)
	{
		return hibernateTemplate.get(LogIn.class, logInId);
	}

	public List<LogIn> getAllLogIn()
	{
		return hibernateTemplate.loadAll(LogIn.class);
	}
}
