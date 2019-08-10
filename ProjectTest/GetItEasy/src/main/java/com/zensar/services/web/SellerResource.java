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



import com.zensar.entities.Seller;
import com.zensar.entities.User;
import com.zensar.services.business.SellerService;
import com.zensar.services.business.UserService;

@RestController
@RequestMapping("/sellers")
public class SellerResource {
	
	
	@Autowired
	private SellerService service;
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping
	public String createSeller(@RequestParam("sellerId") int sellerId,@RequestParam("user") int  userId)
			
	
	{
		
		User user = userService.findUserById(userId);
		Seller seller = new Seller(sellerId, user);
		service.createSeller(seller);
		return "Seller " + sellerId + "created succesfully" ;
		
	}
	
	@PutMapping
	public String editSeller(@RequestBody Seller seller)
	{
		service.editSeller(seller);
		return "Seller" + seller.getSellerId() + " edited succesfully";
	}
	
	@GetMapping("/{id}")
	public Seller getSeller(@PathVariable("id") int sellerId)
	{
		return service.findSellerById(sellerId);
	}
	
	@DeleteMapping
	public String removeSeller (@RequestBody Seller seller)
	{
		service.removeSeller(seller);
		
		return "Seller" + seller.getSellerId() + "seller removed";
	}
	
	/*
	 * @GetMapping("/count") public int getProductCount() { return
	 * service.findAllProducts().size(); }
	 */
	
	@GetMapping
	
	public List<Seller> getAllSellers()
	{
		return service.findAllSellers();
	}
	
}
