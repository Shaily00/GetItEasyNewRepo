package com.zensar.entities;

public class User
{
	private int userId;
	private String userName;
	private String userContact;
	private String userEmail;
	private String userAddress;
	
	
	public User(int userId, String userName, String userContact, String userEmail, String userAddress) 
	{
		super();
		this.userId = userId;
		this.userName = userName;
		this.userContact = userContact;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
	}
	
	public int getUserId()
	{
		return userId;
	}
	
	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public String getUserContact() 
	{
		return userContact;
	}
	
	public void setUserContact(String userContact) 
	{
		this.userContact = userContact;
	}
	
	public String getUserEmail()
	{
		return userEmail;
	}
	
	public void setUserEmail(String userEmail)
	{
		this.userEmail = userEmail;
	}
	
	public String getUserAddress()
	{
		return userAddress;
	}
	
	public void setUserAddress(String userAddress)
	{
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userContact=" + userContact + ", userEmail="
				+ userEmail + ", userAddress=" + userAddress + "]";
	}
	
	

}
