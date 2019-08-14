package com.zensar.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.zensar.entities.Auction;
import com.zensar.entities.Product;
@Repository
public class AuctionDaoImpl implements AuctionDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void insertAuction(Auction auction)
	{
		hibernateTemplate.save(auction);		
	}

	public void updateAuction(Auction auction) 
	{
		hibernateTemplate.update(auction);
	}

	public void deleteAuction(Auction auction) 
	{
		hibernateTemplate.delete(auction);
	}

	public Auction getAuctionById(int auctionId)
	{
		return hibernateTemplate.get(Auction.class, auctionId);
	}

	public List<Auction> getAllAuction()
	{
		return hibernateTemplate.loadAll(Auction.class);
	}

	public Auction calculateAuctionAmount(float totalAmount) {
		
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Auction.class,totalAmount);
	}

	

}
