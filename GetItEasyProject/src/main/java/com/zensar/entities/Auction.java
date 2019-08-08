package com.zensar.entities;

import java.sql.Time;

public class Auction
{
	
	private int auctionId;
	private float auctionPrice;
	private enum autionStatus {active , closed};
	private Product productId;
	private Time timeStamp;
	
	
	
	public Auction(int auctionId, float auctionPrice, Product productId, Time timeStamp) 
	{
		super();
		this.auctionId = auctionId;
		this.auctionPrice = auctionPrice;
		this.productId = productId;
		this.timeStamp = timeStamp;
	}
	
	public int getAuctionId()
	{
		return auctionId;
	}
	
	public void setAuctionId(int auctionId)
	{
		this.auctionId = auctionId;
	}
	
	public float getAuctionPrice()
	{
		return auctionPrice;
	}
	
	public void setAuctionPrice(float auctionPrice)
	{
		this.auctionPrice = auctionPrice;
	}
	
	public Product getProductId() 
	{
		return productId;
	}
	
	public void setProductId(Product productId)
	{
		this.productId = productId;
	}
	
	public Time getTimeStamp() 
	{
		return timeStamp;
	}
	
	public void setTimeStamp(Time timeStamp)
	{
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Auction [auctionId=" + auctionId + ", auctionPrice=" + auctionPrice + ", productId=" + productId
				+ ", timeStamp=" + timeStamp + "]";
	}
	
	
}
