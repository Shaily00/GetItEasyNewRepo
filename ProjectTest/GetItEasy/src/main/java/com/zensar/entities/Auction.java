package com.zensar.entities;

import java.security.Timestamp;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Entity
@Table(name="auction")
public class Auction
{
	@Id
	@Column(name="auctionId")
	
	private int auctionId;
	
	
	

	
	@OneToOne
	@JoinColumn(name="p_auctionId",referencedColumnName = "productId" )
	@NotNull
	
	private Product productId;
	
	@OneToOne
	@JoinColumn(name="p_auctionPrice",referencedColumnName = "productPrice")
	private Product productPrice;
	
	@Column(name = "timeStamp")
	private Timestamp timeStamp;
	private String[] status= {"active","closed"};
	
	
	public Auction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Auction(int auctionId,Product productId, Product productPrice,  Timestamp timeStamp) 
	{
		super();
		this.auctionId = auctionId;
		this.productPrice = productPrice;
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
	
	
	
	public Product getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Product productPrice) {
		this.productPrice = productPrice;
	}

	public Product getProductId() 
	{
		return productId;
	}
	
	public void setProductId(Product productId)
	{
		this.productId = productId;
	}
	
	

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String[] getStatus() {
		return status;
	}

	public void setStatus(String[] status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Auction [auctionId=" + auctionId + ", auctionPrice=" + productPrice + ", productId=" + productId
				+ ", timeStamp=" + timeStamp + "]";
	}
	
	
}
