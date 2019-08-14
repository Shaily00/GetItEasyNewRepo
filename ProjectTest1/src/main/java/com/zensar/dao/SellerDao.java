package com.zensar.dao;

import java.util.List;

import com.zensar.entities.Seller;

public interface SellerDao {
	void insertSeller(Seller seller);
	void updateSeller(Seller seller);
	void deleteSeller(Seller seller);
	Seller getByIdSeller(int sellerId);
	List<Seller> getAllSeller();

}
