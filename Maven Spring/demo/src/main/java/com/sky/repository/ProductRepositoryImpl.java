package com.sky.repository;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sky.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	private static List<Product> products = new ArrayList<Product>();

	@Override
	public void addProduct(Product product) {
		System.out.println("in repositary");

		products.add(product);

	}

	@Override
	public List<Product> getProducts() {

		return products;
	}

	public Product getProductByid(String productId) {
		for (Product product : products) {
			if (product.getProductId().equals(productId)) {
				System.out.println(product.getProductId());
				System.out.println(product.getProductName());
				System.out.println(product.getPrice());
				return product;
			}

		}
		return null;
	}

	@Override
	public Product deleteByID(String productId) {
		int index = 0;
		for (Product product : products) {

			if (product.getProductId().equals(productId)) {
				products.remove(index);
				return product;
			}
			index = index + 1;

		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product UpdateProduct(Product product) {
		int index = 0;
		for (Product product1 : products) {
			if (product1.getProductId().equals(product.getProductId())) {
				products.set(index, product);
				return product;

			}
			index++;

		}
		// TODO Auto-generated method stub
		return null;
	}

}
