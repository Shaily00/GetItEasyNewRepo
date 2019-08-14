package com.zensar.services.business;
 
import java.util.List;
 
import com.zensar.entities.Auction;
 
public interface AuctionService {
 
	void createAuction(Auction auction);
	void editAuction(Auction auction);
	void removeAuction(Auction auction);
	Auction findAuctionById(int auctionId);
	String calculateTotalAmount(int auctionId,float totalAmount);
	List<Auction> findAllAuctions();
}