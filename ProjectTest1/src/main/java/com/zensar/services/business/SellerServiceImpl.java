package com.zensar.services.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.dao.SellerDao;
import com.zensar.entities.Product;
import com.zensar.entities.Seller;
@Service
@Transactional
public class SellerServiceImpl implements SellerService {

	@Autowired
	private SellerDao sellerDao;
	@Override
	public void createSeller(Seller seller) {
		sellerDao.insertSeller(seller);

	}

	@Override
	public void editSeller(Seller seller) {
		
	}

	@Override
	public void removeSeller(Seller seller) {
		// TODO Auto-generated method stub
	}

	@Override
	public Seller findSellerById(int sellerId) {
		return sellerDao.getByIdSeller(sellerId);
	}

	@Override
	public List<Seller> findAllSellers() {
		return sellerDao.getAllSeller();	}

}
