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
@Table(name="seller")
public class Seller {
	
	@Id
	@Column(name = "sellerId")
	private int sellerId;
	
	
	@OneToOne
	@JoinColumn(name = "s_userId",referencedColumnName = "userId")
	@NotNull
	private User user;
	
	@OneToOne
	@JoinColumn(name="s_productPrice",referencedColumnName = "productPrice")
	@NotNull
	private Product productPrice;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}
	
	public Seller(int sellerId,  User user) 
	{
		super();
		this.sellerId = sellerId;
		
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
	
	
	
	public User getUser() 
	{
		return user;
	}
	
	public void setUser(User user)
	{
		this.user = user;
	}

	public Product getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Product productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", user=" + user + "]";
	}

	

	
	

}
