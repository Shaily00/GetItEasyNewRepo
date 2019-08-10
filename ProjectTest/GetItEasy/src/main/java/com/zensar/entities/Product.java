package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Entity
@Table(name = "product")
public class Product {
	@Id
	@Column(name="productId")
	private int productId;
	
	@Column(name="productName")
	@NotNull
	private String productName;
	
	@Column(name = "productPrice")
	@NotNull
	private float productPrice;


	  @OneToOne(targetEntity = Seller.class)
	  @JoinColumn(name = "p_seller", referencedColumnName = "sellerId" )
	  @NotNull
	  private Seller seller;
	 

	public Product() {
		super();
	}

	public Product(int productId, String productName, float productPrice,Seller seller) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;

		this.seller = seller; 
	}

	/* Getter and Setter for product Table */

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public Seller getseller() { return seller; }
	  
	 public void setseller(Seller seller) { this.seller = seller; }

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", seller=" + seller + "]";
	}
	 
	 

}
