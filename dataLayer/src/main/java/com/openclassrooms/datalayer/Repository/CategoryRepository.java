package com.openclassrooms.datalayer.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.datalayer.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{
	
	public Iterable<Category> findCategoryByName(String name);
	
	public Iterable<Category> findByProductsName(String name);
}
