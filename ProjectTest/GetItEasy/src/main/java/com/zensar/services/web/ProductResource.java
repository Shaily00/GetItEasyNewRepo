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

import com.zensar.entities.Product;
import com.zensar.entities.Seller;
import com.zensar.services.business.ProductService;
import com.zensar.services.business.SellerService;

@RestController
@RequestMapping("/products")
public class ProductResource {
	
	
	@Autowired
	private ProductService service;
	@Autowired
	private SellerService sellerService;
	
	@PostMapping
	public String createProduct(@RequestParam("productId") int productId,@RequestParam ("productName") String name,
			
			@RequestParam("productPrice") float price,
			@RequestParam("seller") int  sellerId)
	
	{
		Seller seller= sellerService.findSellerById(sellerId);
		Product product = new Product(productId, name, price,seller);
		service.createProduct(product);
		return "Product " + productId + "created succesfully" ;
		
	}
	
	@PutMapping
	public String editProduct(@RequestBody Product product)
	{
		service.editProduct(product);
		return "Product" + product.getProductId() + " edited succesfully";
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") int productId)
	{
		return service.findProductById(productId);
	}
	
	@DeleteMapping
	public String removeProduct (@RequestBody Product product)
	{
		service.removeProduct(product);
		
		return "Product" + product.getProductId() + "product removed";
	}
	
	/*
	 * @GetMapping("/count") public int getProductCount() { return
	 * service.findAllProducts().size(); }
	 */
	
	@GetMapping
	
	public List<Product> getAllProducts()
	{
		return service.findAllProducts();
	}
	

}
