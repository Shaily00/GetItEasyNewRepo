package com.zensar.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.zensar.entities.Buyer;
@Repository
public class BuyerDaoImpl implements BuyerDao
{
@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void insertBuyer(Buyer buyer)
	{
		hibernateTemplate.save(buyer);		
	}

	public void updateBuyer(Buyer buyer) 
	{
		hibernateTemplate.update(buyer);
	}

	public void deleteBuyer(Buyer buyer) 
	{
		hibernateTemplate.delete(buyer);
	}

	public Buyer getByIdBuyer(int buyerId)
	{
		return hibernateTemplate.get(Buyer.class, buyerId);
	}

	public List<Buyer> getAllBuyer()
	{
		return hibernateTemplate.loadAll(Buyer.class);
	}

}

	

	
