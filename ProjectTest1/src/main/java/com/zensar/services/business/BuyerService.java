package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Buyer;

public interface BuyerService {
	
	void createBuyer(Buyer buyer);
	void editBuyer(Buyer buyer);
	void removeBuyer(Buyer buyer);
	Buyer findBuyerById(int buyerId);
	List<Buyer> findAllBuyers();

}



 
 
