package eaut.it.java_tech_course.springMvcDemo.service;

import java.util.List;

import eaut.it.java_tech_course.springMvcDemo.model.Product;

public interface ProductService {
	List<Product> getAllProducts();
	Product getProductById(int id);
}
