package com.sky.repository;

import java.util.List;

import com.sky.model.Product;

public interface ProductRepository {
	public void addProduct (Product product);
	public List<Product> getProducts();
	public Product getProductByid(String productId);
	public Product UpdateProduct(Product product);
	 public Product deleteByID(String productId);

}
