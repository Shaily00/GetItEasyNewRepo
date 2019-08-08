package com.zensar.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.zensar.entities.Product;
@Repository
public class ProductDaoImpl implements ProductDao
{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void insertProduct(Product product)
	{
		hibernateTemplate.save(product);		
	}

	public void updateProduct(Product product) 
	{
		hibernateTemplate.update(product);
	}

	public void deleteProduct(Product product) 
	{
		hibernateTemplate.delete(product);
	}

	public Product getByIdProduct(int productId)
	{
		return hibernateTemplate.get(Product.class, productId);
	}

	public List<Product> getAllProduct()
	{
		return hibernateTemplate.loadAll(Product.class);
	}

}

	

