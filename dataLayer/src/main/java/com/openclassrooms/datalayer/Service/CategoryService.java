package com.openclassrooms.datalayer.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.datalayer.Repository.CategoryRepository;
import com.openclassrooms.datalayer.model.Category;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Iterable<Category> getCategory(){
		return categoryRepository.findAll();
	}
	
	public Optional<Category> getCategoryById(Integer id){
		return categoryRepository.findById(id);
	}
	
	public Iterable<Category> getCategoryByName(String name){
		return categoryRepository.findCategoryByName(name);
	}
	
	public Iterable<Category> getByProductName(String name){
		return categoryRepository.findByProductsName(name);
	}
	
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	
	public void removeCategoryById(Integer id) {
		categoryRepository.deleteById(id);
	}
}
