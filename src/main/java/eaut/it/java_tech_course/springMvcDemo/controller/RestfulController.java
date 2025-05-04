package eaut.it.java_tech_course.springMvcDemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eaut.it.java_tech_course.springMvcDemo.model.Product;
import eaut.it.java_tech_course.springMvcDemo.service.ProductService;

@RestController
@RequestMapping("/api")
public class RestfulController {
	@Autowired
	private ProductService productService;

	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

	@GetMapping("/status")
	public Map<String, Object> getStatus() {
		Map<String, Object> map = new HashMap<>();
		map.put("status", "OK");
		return map;
	}

	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") int id) {
		var product = productService.getProductById(id); // 404 Not Found
		if (product == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(product); // 200 OK
	}
}
