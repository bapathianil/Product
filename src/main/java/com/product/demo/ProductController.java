package com.product.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
    ProductJdbcRepository repository;
	
	@PostMapping(path="/productinfo")
	public Product getProductById( int id) {
		Product tr = new Product();
		tr=repository.findById(id);
		System.out.println("Product is :"+id);
		return tr;
	}
	
	@GetMapping(path="/productsinfo")
	public List<Product> getProducts() {
		List<Product> aa = new ArrayList<Product>();
		aa=repository.findAll();
		System.out.println("Products are :"+aa);
		return aa;
	}
	
	@PostMapping(path="/productdeleteinfo")
	public int deleteProducts(int id) {
		int deletedId=repository.deleteById(id);
		System.out.println("Deleted Product is :"+deletedId);
		return deletedId;
	}
	
	@PostMapping(path="/productupdateinfo")
	public int updateProducts(Product product) {
		int updatedId=repository.update(product);
		System.out.println("Updated Product is :"+updatedId);
		return updatedId;
	}
	
	@PostMapping(path="/productinsertinfo")
	public int insertProducts(Product product) {
		int insertedId=repository.insert(product);
		System.out.println("Inserted Product is :"+insertedId);
		return insertedId;
	}

}

	
