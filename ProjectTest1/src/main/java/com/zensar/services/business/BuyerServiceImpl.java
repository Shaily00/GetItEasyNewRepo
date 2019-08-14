package com.zensar.services.business;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.zensar.dao.BuyerDao;
import com.zensar.entities.Buyer;
 
 
@Service
@Transactional
public class BuyerServiceImpl implements BuyerService {
 
	@Autowired
	private BuyerDao dao;
 
	public void createBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
 
		dao.insertBuyer(buyer);
	}
 
	public void editBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
    Buyer dbBuyer = findBuyerById(buyer.getBuyerId());
    if(dbBuyer!=null){
    	dbBuyer.setBuyerId(buyer.getBuyerId());
    	dbBuyer.setUserId(buyer.getUserId());
    	dbBuyer.setBuyerCredits(buyer.getBuyerCredits());
    	dao.updateBuyer(dbBuyer);
    }
    else
    	System.out.println("Sorry!!Buyer does not exist");
}
 
	public void removeBuyer(Buyer Buyer) {
		// TODO Auto-generated method stub
	   Buyer dbBuyer =findBuyerById(Buyer.getBuyerId());
	   if(dbBuyer!=null){
		   dao.deleteBuyer(dbBuyer);
	   }
	   else
		   System.out.println("Nothing to Delete");
 
 
 
	}
 
	public Buyer findBuyerById(int BuyerId) {
		// TODO Auto-generated method stub
		return dao.getByIdBuyer(BuyerId);
	}
 
	public List<Buyer> findAllBuyers() {
		// TODO Auto-generated method stub
		return dao.getAllBuyer();
	}
 
 
 
 
}