package com.zensar.dao;
import java.util.List;
import com.zensar.entities.Product;
public interface ProductDao
{
	void insertProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(Product product);
	Product getByIdProduct(int productId);
	List<Product> getAllProduct(); 
}
