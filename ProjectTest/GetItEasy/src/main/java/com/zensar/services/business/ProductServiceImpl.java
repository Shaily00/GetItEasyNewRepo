package com.zensar.services.business;


/*
 * Author:Shaily Agrawal
 * Creation Date: 30th jul 2019 04.50 PM
 * Modified Date: 31th July 2019 04:50 PM
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Represents business entity product
 * It is impl of product service
 * value object of application
 * domain or application object.
 * It contains CRUD operations for entity product.
 * 
 **/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.dao.ProductDao;
import com.zensar.entities.Auction;
import com.zensar.entities.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	
	@Autowired
	private ProductDao productDao;

	public void createProduct(Product product) {
		productDao.insertProduct(product);
		// TODO Auto-generated method stub

	}

	public void editProduct(Product product) {
		Product dbProduct = findProductById(product.getProductId());
		if(dbProduct!=null)
		{ 
			dbProduct.setProductName(product.getProductName());
			
			dbProduct.setProductPrice(product.getProductPrice());
			productDao.updateProduct(dbProduct);
		}
		else
			System.out.println("Product doesnt exist");
		// TODO Auto-generated method stub

	}

	public void removeProduct(Product product) {
		Product dbProduct = findProductById(product.getProductId());
		if(dbProduct!=null)
		{
			productDao.deleteProduct(dbProduct);
		}
		else
			System.out.println("Product doesnt exist");

	}

	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return productDao.getByProductId(productId);
	}

	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProduct();
	}
	public Product findProductPrice(int productPrice) {
		return productDao.getProductPrice(productPrice);
		// TODO Auto-generated method stub
		
	}

}
