package eaut.it.java_tech_course.springMvcDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import eaut.it.java_tech_course.springMvcDemo.model.User;
import jakarta.validation.Valid;

@Controller
public class UserController {
	@GetMapping("/register")
	public String showForm(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@PostMapping("/register")
	public String processForm(@ModelAttribute("user") @Valid User user, BindingResult result) {
		if (result.hasErrors()) {
//			return "register";
			throw new RuntimeException("Có lỗi xảy ra trong quá trình xử lý dữ liệu");
		}
		// Lưu user hoặc xử lý khác
		return "success";
	}

//	@ExceptionHandler(IllegalArgumentException.class)
//	public String handleExceptions(Model model, Exception e) {
//		model.addAttribute("errorMessage", e.getMessage());
//		return "error";
//	}
}
