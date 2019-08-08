package com.zensar.entities;

public class Buyer
{
	private int buyerId;
	private User userId;
	private int buyerCredits;
	
	
	public Buyer(int buyerId, User userId, int buyerCredits) 
	{
		super();
		this.buyerId = buyerId;
		this.userId = userId;
		this.buyerCredits = buyerCredits;
	}
	
	public int getBuyerId()
	{
		return buyerId;
	}
	
	public void setBuyerId(int buyerId)
	{
		this.buyerId = buyerId;
	}
	
	public User getUserId() 
	{
		return userId;
	}
	
	public void setUserId(User userId)
	{
		this.userId = userId;
	}
	
	public int getBuyerCredits() 
	{
		return buyerCredits;
	}
	
	public void setBuyerCredits(int buyerCredits) 
	{
		this.buyerCredits = buyerCredits;
	}

	@Override
	public String toString()
	{
		return "Buyer [buyerId=" + buyerId + ", userId=" + userId + ", buyerCredits=" + buyerCredits + "]";
	}
}
