package com.isaacbcdev.springweb.controllers;

import com.isaacbcdev.springweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/mvc") // This will map all requests to /mvc
public class UserController {
    // This class will handle user-related request,
    // For example, creating a new user, updating user information, etc.
    // You can use Spring's @Controller annotation to define this class as a controller
    // and use @RequestMapping to map HTTP requests to specific methods in this class.

    // This method will handle GET requests to the "/user" URL
    // and return the "details" view.
    @GetMapping("/user-details")
    public String details(Model model) {
        // You can add attributes to the model to be used in the view,
        // For example, model.addAttribute("user", user);
        // This will add a "user" attribute to the model with the value of the user object
        // You can also use the model to pass data to the view template (e.g., Thymeleaf, JSP, etc.) that will be rendered.

        User user = new User("Isaac", "Coding");
        model.addAttribute("user", user);
        model.addAttribute("age", "15");
        return "details"; // This will return the "details" view - It is case-sensitive and should match the name of the HTML file in the 'templates' directory.
    }

    // This method will handle GET requests to the "/user" URL
    // and return the "user" view.
    @GetMapping("/user")
    public String user(Map<String, Object> model) {
        // You can add attributes to the model to be used in the view
        // For example, model.put("user", user);
        // This will add a "user" attribute to the model with the value of the user object
        // You can also use the model to pass data to the view template (e.g., Thymeleaf, JSP, etc.) that will be rendered.
        model.put("user", "Isaac");
        return "details"; // This will return the "user" view - It is case-sensitive and should match the name of the HTML file in the templates directory.
    }
}