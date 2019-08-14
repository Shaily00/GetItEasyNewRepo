package com.zensar.services.web;



import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Auction;
import com.zensar.entities.Product;

import com.zensar.services.business.AuctionService;
import com.zensar.services.business.ProductService;

@RestController
@RequestMapping("/auctions")
public class AuctionResource {
	
		@Autowired
		private AuctionService auctionservice;
		
		@Autowired
		private ProductService productService;
		
		
		@PostMapping
		public String createAuction(@RequestParam("auctionId") int auctionId,@RequestParam("product") int  productId,
				@RequestParam("productPrice") int productPrice,@RequestParam("timeStamp") Timestamp timeStamp,
				@RequestParam ("bidCount") int bidCount, @RequestParam ("biddingAmount") int biddingAmount,
				@RequestParam("status") String[] status)
				
		{
			Product product= productService.findProductById(productId);
			Product product2=productService.findProductPrice(productPrice);
			Auction auction = new Auction(auctionId, product,product2,timeStamp,status,biddingAmount,bidCount);
			auctionservice.createAuction(auction);
			return "Auction " + auctionId + "created succesfully" ;
			
		}
		
		@PutMapping
		public String editAuction(@RequestBody Auction auction)
		{
			auctionservice.editAuction(auction);
			return "Auction" + auction.getAuctionId() + " edited succesfully";
		}
		
		@GetMapping("/{id}")
		public Auction getAuction(@PathVariable("id") int auctionId)
		{
			return auctionservice.findAuctionById(auctionId);
		}
		
		@DeleteMapping
		public String removeAuction (@RequestBody Auction auction)
		{
			auctionservice.removeAuction(auction);
			
			return "Auction" + auction.getAuctionId() + "auction removed";
		}
		
		/*
		 * @GetMapping("/count") public int getProductCount() { return
		 * service.findAllProducts().size(); }
		 */
		
		@GetMapping
		
		public List<Auction> getAllAuctions()
		{
			return auctionservice.findAllAuctions();
		}
		
		@PutMapping
		
		public void updateAuctionCount(@RequestBody Auction auction)
		{
			Auction dbAuction = auctionservice.findAuctionById(auction.getAuctionId());
			dbAuction.setBidCount(auction.getBidCount());
			auctionservice.editAuction(dbAuction);	
		}
		
		@GetMapping("/{id}")
		public int getAuctionCount(@PathVariable ("id") int auctionId)
		{
			return auctionservice.findAuctionById(auctionId).getBidCount();
		}
		
		@GetMapping("/{id}")
				
		public float getAuctionAmount(@PathVariable("id") int auctionId)
		{
			return auctionservice.findAuctionById(auctionId).
		}
		
		
	}



