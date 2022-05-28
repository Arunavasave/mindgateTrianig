package com.sky.service;

import java.util.List;


import com.sky.model.Product;

public interface ProductService {
	public void addProduct (Product product);
	public List<Product> getProducts();
    public Product getProductByid(String productId);
   public Product UpdateProduct(Product product);
    public Product deleteByID(String productId);
}

