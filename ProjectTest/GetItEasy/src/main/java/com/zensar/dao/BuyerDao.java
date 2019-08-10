package com.zensar.dao;
import java.util.List;
import com.zensar.entities.Buyer;
public interface BuyerDao {
	
	void insertBuyer(Buyer buyer);
	void updateBuyer(Buyer buyer);
	void deleteBuyer(Buyer buyer);
	Buyer getByIdBuyer(int buyerId);
	List<Buyer> getAllBuyer(); 
}

