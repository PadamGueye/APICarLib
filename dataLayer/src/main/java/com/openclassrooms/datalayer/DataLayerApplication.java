package com.openclassrooms.datalayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.openclassrooms.datalayer.Service.CategoryService;
import com.openclassrooms.datalayer.Service.CommentService;
import com.openclassrooms.datalayer.Service.ProductService;
import com.openclassrooms.datalayer.model.Category;
import com.openclassrooms.datalayer.model.Comment;
import com.openclassrooms.datalayer.model.Product;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class DataLayerApplication implements CommandLineRunner{
	
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private CommentService commentService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DataLayerApplication.class, args);
	}
	
	@Override
	@Transactional
	public void run(String... args){
		System.out.println("Hello api");
		/*Iterable<Product> produits = productService.getProducts();
		Iterable<Comment> comments = commentService.getComments();
		Iterable<Category> categories = categoryService.getCategory();
		
		produits.forEach(product -> System.out.println(product.getName()));
		comments.forEach(comment -> System.out.println(comment.getContent()));
		categories.forEach(categorie-> System.out.println(categorie.getName()));*/
		/*
		Optional<Product> optProduct = productService.getProductById(3);
		Product product3 = optProduct.get();
		
		Category category1 = categoryService.getCategoryById(1).get();
		Optional<Comment> optComment = commentService.getCommentById(2);
		Comment comment2 = optComment.get();
		
		
		System.out.println("Produit du comment2 : "+comment2.getProduct().getName());
		
		
		System.out.println("Produit3 : "+product3.getName()+
							"\nCategory1 : "+category1.getName()+
							"\nCommentaire2 : "+comment2.getContent());
		
		
		System.out.println("category1 : "+category1.getName());
		category1.getProduct().forEach(product->System.out.println(product.getName()));
		
		System.out.println("\n\n");
		
		System.out.println("Produit3 : "+product3.getName());
		product3.getComments().forEach(comment-> System.out.println(comment.getContent()));
		product3.getCategories().forEach(category-> System.out.println(category.getName()));

		System.out.println("\n\n");
		
		
		//Category Create
		
		Category newCat = new Category("padam");
		newCat = categoryService.addCategory(newCat);
		System.out.println("La nouvelle categorie est :"+newCat.getName());
		
		Product prod = new Product();
		prod.setName("Ordinateur");
		prod.setDescription("Hp Elitebook 840 G3");
		prod.setCost(500);
		prod = productService.addProduct(prod);
		
		
		
		
		newCat.addProduct(prod);
		System.out.println(prod.getName());
		
		Comment newComment = new Comment("Je suis un commentaire pour l'ordinateur");
		prod.addComment(newComment);
		newComment = commentService.addComment(newComment);
		
		System.out.println(prod.getName());
		prod.getCategories().forEach(category-> System.out.println(category.getName()));
		prod.getComments().forEach(comment-> System.out.println(comment.getContent()));
		
		
		Iterable<Product> resultSearchProduct = productService.getByCategoriesName("Standard");
		resultSearchProduct.forEach(product-> System.out.println(product.getProductId()));
		
		
		Iterable<Category> resultSearchCategory = categoryService.getCategoryByName("padam");
		resultSearchCategory.forEach(category-> System.out.println(category.getCategoryId()));
		}
		

		Iterable<Category> resultSearchProductName = categoryService.getByProductName("AssuranceAuTiersEtendue");
		resultSearchProductName.forEach(category-> System.out.println(category.getName()));
		
		
		Iterable<Product> resultSearchProductCost = productService.getByCostLessThan(1000);
		resultSearchProductCost.forEach(product-> System.out.println(product.getName()));
		
		*/
		
		Iterable<Comment> resultSearchComment = commentService.getByContentContains("attendre");
		resultSearchComment.forEach(comment-> System.out.println(comment.getCommentId()));
	}
}
