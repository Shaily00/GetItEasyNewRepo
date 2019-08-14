package com.zensar.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.zensar.entities.Seller;

@Repository
public class SellerDaoImpl implements SellerDao
{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void insertSeller(Seller seller)
	{
		hibernateTemplate.save(seller);		
	}

	public void updateSeller(Seller seller) 
	{
		hibernateTemplate.update(seller);
	}

	public void deleteSeller(Seller seller) 
	{
		hibernateTemplate.delete(seller);
	}

	public Seller getByIdSeller(int sellerId)
	{
		return hibernateTemplate.get(Seller.class, sellerId);
	}

	public List<Seller> getAllSeller()
	{
		return hibernateTemplate.loadAll(Seller.class);
	}

}

	



	
