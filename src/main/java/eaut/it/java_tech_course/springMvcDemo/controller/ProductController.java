package eaut.it.java_tech_course.springMvcDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eaut.it.java_tech_course.springMvcDemo.model.Product;
import eaut.it.java_tech_course.springMvcDemo.service.ProductService;

@Controller
public class ProductController {
	private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String showProducts(Model model) {
    	List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "product-list";
    }
}
