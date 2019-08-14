package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="buyer")
public class Buyer
{
	@Id
	@Column(name="buyerId")
	private int buyerId;
	
	@OneToOne
	@JoinColumn(name = "b_userId",referencedColumnName = "userId")
	@NotNull
	private User userId;
	
	@Column(name="buyerCredits")
	private int buyerCredits;
	
	
	public Buyer() {
		
	}
	
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
