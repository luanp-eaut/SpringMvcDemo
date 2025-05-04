package eaut.it.java_tech_course.springMvcDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import eaut.it.java_tech_course.springMvcDemo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	private List<Product> products = new ArrayList<>();

	public ProductServiceImpl() {
		this.products.add(new Product(1, "Laptop", 1200.0));
		this.products.add(new Product(2, "Phone", 800.0));
		this.products.add(new Product(3, "Tablet", 500.0));
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "Laptop", 1200.0));
		list.add(new Product(2, "Phone", 800.0));
		list.add(new Product(3, "Tablet", 500.0));
		return list;
	}

	@Override
	public Product getProductById(int id) {
		return products.stream()
				.filter(product -> product.getId() == id)
				.findFirst()
				.orElse(null);
	}
}
