package com.openclassrooms.datalayer.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.datalayer.Repository.ProductRepository;
import com.openclassrooms.datalayer.model.Product;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public Iterable<Product> getProducts(){
		return productRepository.findAll();
	}
	
	public Iterable<Product> getProductsByName(String name){
		return productRepository.findByName(name);
	}
	
	public Iterable<Product> getByCategoriesName(String name){
		return productRepository.findByCategoriesName(name);
	}
	
	public Optional<Product> getProductById(Integer id) {
		return productRepository.findById(id);
	}
	
	public  Iterable<Product> getByCostLessThan(Integer cost){
		return productRepository.findByCostLessThan(cost);
	}
	
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	
	public void removeProductById(Integer id) {
		productRepository.deleteById(id);
	}
		
}
