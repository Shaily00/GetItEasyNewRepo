package com.zensar.entities;

public class LogIn
{
	private int logInId;
	private String name;
	private String password;
	private enum role {admin ,customer};
	
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
