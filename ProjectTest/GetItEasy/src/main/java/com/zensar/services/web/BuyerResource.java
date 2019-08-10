package com.zensar.services.web;

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

import com.zensar.entities.Buyer;
import com.zensar.entities.User;
import com.zensar.services.business.UserService;
import com.zensar.services.business.BuyerService;

@RestController
@RequestMapping("/buyers")
public class BuyerResource {
	
	
	@Autowired
	private BuyerService buyerService;
	@Autowired
	private UserService userService;
	
	@PostMapping
	public String createBuyer(@RequestParam("buyerId") int buyerId,@RequestParam ("user") int  userId,
			
			@RequestParam("buyerCredits") int buyerCredits)
	
	{
		User user = userService.findUserById(userId);
		Buyer buyer = new Buyer(buyerId, user, buyerCredits);
		buyerService.createBuyer(buyer);
		return "Buyer " + buyerId + "created succesfully" ;
		
	}
	
	@PutMapping
	public String editBuyer(@RequestBody Buyer buyer)
	{
		buyerService.editBuyer(buyer);
		return "Buyer" + buyer.getBuyerId() + " edited succesfully";
	}
	
	@GetMapping("/{id}")
	public Buyer getBuyer(@PathVariable("id") int buyerId)
	{
		return buyerService.findBuyerById(buyerId);
	}
	
	@DeleteMapping
	public String removeBuyer (@RequestBody Buyer buyer)
	{
		buyerService.removeBuyer(buyer);
		
		return "Buyer" + buyer.getBuyerId() + "buyer removed";
	}
	
	/*
	 * @GetMapping("/count") public int getProductCount() { return
	 * buyerService.findAllProducts().size(); }
	 */
	
	@GetMapping
	
	public List<Buyer> getAllBuyers()
	{
		return buyerService.findAllBuyers();
	}
	

}
