package com.zensar.entities;

import java.sql.Time;

public class Order
{
	private Product productId;
	private Auction auctionId;
	private Auction auctionPrice;
	private Auction timeStamp;
	private Buyer buyerId;
	
	
	public Order(Product productId, Auction auctionId, Auction auctionPrice, Auction timeStamp, Buyer buyerId) 
	{
		super();
		this.productId = productId;
		this.auctionId = auctionId;
		this.auctionPrice = auctionPrice;
		this.timeStamp = timeStamp;
		this.buyerId = buyerId;
	}
	
	public Product getProductId()
	{
		return productId;
	}
	
	public void setProductId(Product productId) {
		this.productId = productId;
	}
	
	public Auction getAuctionId() {
		return auctionId;
	}
	
	public void setAuctionId(Auction auctionId) {
		this.auctionId = auctionId;
	}
	
	public Auction getAuctionPrice() {
		return auctionPrice;
	}
	
	public void setAuctionPrice(Auction auctionPrice)
	{
		this.auctionPrice = auctionPrice;
	}
	
	public Auction gettimeStamp()
	{
		return timeStamp;
	}
	
	public void settimeStamp(Auction timeStamp) 
	{
		this.timeStamp = timeStamp;
	}
	
	public Buyer getBuyerId() 
	{
		return buyerId;
	}
	
	public void setBuyerId(Buyer buyerId)
	{
		this.buyerId = buyerId;
	}

	@Override
	public String toString()
	{
		return "Order [productId=" + productId + ", auctionId=" + auctionId + ", auctionPrice=" + auctionPrice
				+ ", timeStamp=" + timeStamp + ", buyerId=" + buyerId + "]";
	}
 

}
