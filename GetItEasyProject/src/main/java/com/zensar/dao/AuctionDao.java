package com.zensar.dao;
import java.util.List;
import com.zensar.entities.Auction;
public interface AuctionDao {
	void insertAuction(Auction auction);
	void updateAuction(Auction auction);
	void deleteAuction(Auction auction);
	Auction getByIdAuction(int auctionId);
	List<Auction> getAllAuction(); 
}
