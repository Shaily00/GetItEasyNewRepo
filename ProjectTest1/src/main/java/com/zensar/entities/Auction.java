package com.zensar.entities;

import java.sql.Timestamp;
import java.util.Arrays;

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
	private float productPrice;
	
	@Column(name = "timeStamp")
	private Timestamp timeStamp;
	private String[] status= {"live","closed"};
	private int bidCount;
	private int biddingAmount;
	
	
	
	public Auction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Auction(int auctionId,Product productId, float productPrice,  Timestamp timeStamp, String[] status,int bidCount,int biddingAmount) 
	{
		super();
		this.auctionId = auctionId;
		this.productPrice = productPrice;
		this.productId = productId;
		this.timeStamp = timeStamp;
		this.status=status;
		this.biddingAmount=10;
		this.bidCount=bidCount;
	}
	
	public int getAuctionId()
	{
		return auctionId;
	}
	
	public void setAuctionId(int auctionId)
	{
		this.auctionId = auctionId;
	}
	
	
	
	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
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

	public int getBidCount() {
		return bidCount;
	}

	public void setBidCount(int bidCount) {
		this.bidCount = bidCount;
	}

	public int getBiddingAmount() {
		return biddingAmount;
	}

	public void setBiddingAmount(int biddingAmount) {
		this.biddingAmount = 10;
	}

	@Override
	public String toString() {
		return "Auction [auctionId=" + auctionId + ", productId=" + productId + ", productPrice=" + productPrice
				+ ", timeStamp=" + timeStamp + ", status=" + Arrays.toString(status) + ", bidCount=" + bidCount
				+ ", biddingAmount=" + biddingAmount + "]";
	}

	
	
	
}
