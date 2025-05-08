package com.isaacbcdev.springweb.controllers;

import com.isaacbcdev.springweb.dto.ParamDTO;
import com.isaacbcdev.springweb.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/path-var")
public class PathVariableController {

    @GetMapping("/baz/{param}")
    public ParamDTO baz(@PathVariable String param) { // (name = "param") is optional - it's the same as the variable name
        // Simulate some processing
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage("Received path variable: " + param);
        return paramDTO;
    }

    @GetMapping("/foo/{product}/{id}")
    public Map<String, Object> foo(@PathVariable String product,
                                    @PathVariable String id) {
        // Simulate some processing
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);

        return json;
    }

    @PostMapping("/new")
    public User createUser(@RequestBody User user) { // User must have a no-args constructor
        System.out.println("user = " + user);
        // Simulate some processing
        return user;
    }

}