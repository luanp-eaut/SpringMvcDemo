package eaut.it.java_tech_course.springMvcDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Xin chào từ Spring MVC + TomEE + JSP!");
        return "home";
    }
    
    @GetMapping("/error")
    public String error(Model model) {
        model.addAttribute("errorMessage", "Trang này không tồn tại!");
        return "error";
    }
}