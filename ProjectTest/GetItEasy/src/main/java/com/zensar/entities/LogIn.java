package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="login")
public class LogIn
{
	@Id
	@Column(name="logInId")
	private int logInId;
	private String name;
	private String password;
	private enum role {admin ,customer};
	
	public LogIn(){
		
	}
	
	public LogIn(int logInId, String name, String password)
	{
		super();
		this.logInId = logInId;
		this.name = name;
		this.password = password;
	}
	
	public int getlogInId()
	{
		return logInId;
	}
	
	public void setlogInId(int logInId) 
	{
		this.logInId = logInId;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}

	@Override
	public String toString() {
		return "LogIn [logInId=" + logInId + ", name=" + name + ", password=" + password + "]";
	}
	
}
