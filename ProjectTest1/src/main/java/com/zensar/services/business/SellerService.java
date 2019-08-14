package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Seller;


public interface SellerService {
	
	void createSeller(Seller seller);
	void editSeller(Seller seller);
	void removeSeller (Seller seller);
	Seller findSellerById(int sellerId);
	List<Seller> findAllSellers();
	
}
