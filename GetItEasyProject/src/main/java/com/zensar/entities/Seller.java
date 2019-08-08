package com.zensar.entities;

public class Seller
{
	private int sellerId;
	private String sellerIdProof;
	private User user;
	
	
	public Seller(int sellerId, String sellerIdProof, User user) 
	{
		super();
		this.sellerId = sellerId;
		this.sellerIdProof = sellerIdProof;
		this.user = user;
	}
	
	public int getSellerId()
	{
		return sellerId;
	}
	
	public void setSellerId(int sellerId) 
	{
		this.sellerId = sellerId;
	}
	
	public String getSellerIdProof() 
	{
		return sellerIdProof;
	}
	
	public void setSellerIdProof(String sellerIdProof)
	{
		this.sellerIdProof = sellerIdProof;
	}
	
	public User getUser() 
	{
		return user;
	}
	
	public void setUser(User user)
	{
		this.user = user;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerIdProof=" + sellerIdProof + ", user=" + user + "]";
	}
	
	
}
