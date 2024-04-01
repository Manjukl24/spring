package com.productapp.repository;

import java.util.List;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;

public interface IProductRepository {
	
	void addProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(int productId);
	
	Product findById(int productId);
	
	List<Product> findByAll();
	List<Product> findByBrand() throws ProductNotFoundException;
	List<Product> findByLessPrice(double price) throws ProductNotFoundException;
	List<Product> findByCategoryandPrice(String category, double price) throws ProductNotFoundException;

}
