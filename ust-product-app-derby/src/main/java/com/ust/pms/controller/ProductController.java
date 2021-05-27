package com.ust.pms.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ust.pms.model.Product;
import com.ust.pms.service.ProductService;



@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	
	//@RequestMapping(method=RequestMethod.DELETE)
	@DeleteMapping(path="/{productId}")
	public String deleteProuct(@PathVariable("productId")Integer productId) {
		productService.deleteProduct(productId);
		return "Deleting Product";
	}
	
	//@RequestMapping(method=RequestMethod.PUT)
	@PutMapping
	public String updateProuct(@RequestBody Product product) {
		productService.updateProduct(product);
		return "Update Product";
	}
	
	//@RequestMapping(method=RequestMethod.GET)
	@GetMapping
	public List<Product> getProducts() {
		return productService.getProducts();
	}
	
	@GetMapping(path="/{productId}")
	public Product getProduct(@PathVariable("productId") Integer productId) {
		System.out.println("Get product for product id " + productId);
		return productService.getProduct(productId);
	}
	@PostMapping
	public String saveProduct(@RequestBody Product product) {
		System.out.println("Saving product received : "+ product);
		productService.saveProduct(product);
		return "Saving Product" + product;
	}
}
