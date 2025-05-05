package com.isaacbcdev.springweb.controllers;

import com.isaacbcdev.springweb.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
// This annotation indicates that this class is a REST controller, a combination of @Controller and @ResponseBody
@RequestMapping("/api") // This will map all requests to /api
public class UserRestController {
    // This class will handle user-related request,
    // For example, creating a new user, updating user information, etc.
    // You can use Spring's @RestController annotation to define this class as a REST controller
    // and use @RequestMapping to map HTTP requests to specific methods in this class.

    // This method will handle GET requests to the "/user" URL
    // and return a JSON response with the user details.
    @GetMapping("/user-details")
    // @RequestMapping(path="/rest-details", method = RequestMethod.GET) // This is equivalent to @GetMapping("/rest-details")
    public Map<String, Object> user() {
        Map<String, Object> body = new HashMap<>();
        User user = new User("Isaac", "Coding");
        // You can add attributes to the body to be used in the response,
        // For example, body.put("user", user);
        // This will add a "user" attribute to the body with the value of the user object
        // You can also use the body to pass data to the response in JSON format.
        body.put("user", user);
        return body; // This will return a JSON response with the user details
    }
}