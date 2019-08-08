package com.zensar.entities;

public class Product
{
	private int productId;
	private String productName;
	private float productPrice;
	private String productDescription;
	private Seller sellerId;
	
	public Product(int productId, String productName, float productPrice, String productDescription, Seller sellerId) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.sellerId = sellerId;
	}

	/* Getter and Setter for product Table */
 
	public int getProductId() 
	{
		return productId;
	}
	
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	
	public String getProductName() 
	{
		return productName;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	public float getProductPrice() 
	{
		return productPrice;
	}
	
	public void setProductPrice(float productPrice)
	{
		this.productPrice = productPrice;
	}
	
	public String getProductDescription()
	{
		return productDescription;
	}
	
	public void setProductDescription(String productDescription)
	{
		this.productDescription = productDescription;
	}
	
	public Seller getSellerId()
	{
		return sellerId;
	}
	
	public void setSellerId(Seller sellerId)
	{
		this.sellerId = sellerId;
	}

	@Override
	public String toString()
	{
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDescription=" + productDescription + ", sellerId=" + sellerId + "]";
	}
	

}
