package com.zensar.services.business;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.zensar.dao.AuctionDao;
import com.zensar.dao.ProductDao;
import com.zensar.entities.Auction;
import com.zensar.entities.Product;
 
@Service
@Transactional
class AuctionServiceImpl implements AuctionService{
 
 
		@Autowired
		private AuctionDao auctionDao;
		
		@Autowired
		private ProductDao productDao;
 
		public void createAuction(Auction auction) {
			// TODO Auto-generated method stub
 
			auctionDao.insertAuction(auction);
		}
 
		public void editAuction(Auction auction) {
			// TODO Auto-generated method stub
	    Auction dbAuction = findAuctionById(auction.getAuctionId());
	    if(dbAuction!=null){
	    	dbAuction.setAuctionId(auction.getAuctionId());
	    	dbAuction.setProductPrice(auction.getProductPrice());
	    	dbAuction.setProductId(auction.getProductId());
	    	dbAuction.setTimeStamp(auction.getTimeStamp());
	    	auctionDao.updateAuction(dbAuction);
	    }
	    else
	    	System.out.println("Sorry!!Auction does not exist");
	}
 
		public void removeAuction(Auction auction) {
			// TODO Auto-generated method stub
		   Auction dbAuction =findAuctionById(auction.getAuctionId());
		   if(dbAuction!=null){
			   auctionDao.deleteAuction(dbAuction);
		   }
		   else
			   System.out.println("Nothing to Delete");
 
 
 
		}
 
		public Auction findAuctionById(int auctionId) {
			// TODO Auto-generated method stub
			return auctionDao.getAuctionById(auctionId);
		}
 
		public List<Auction> findAllAuctions() {
			// TODO Auto-generated method stub
			return auctionDao.getAllAuction();
		}

		@Override
		public String calculateTotalAmount(int auctionId,float totalAmount) {
			// TODO Auto-generated method stub
			Auction dbAuction = auctionDao.getAuctionById(auctionId);
			totalAmount= dbAuction.getProductPrice()+dbAuction.getBidCount()* dbAuction.getBiddingAmount();
			
			return "Auction id =" + auctionDao.getAuctionById(auctionId) + auctionDao.calculateAuctionAmount(totalAmount);
		}

		

		
		
 
 
 
}