package com.isaacbcdev.springweb.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/value")
public class ValueAnnotationController {

    private final Environment env;
    @Value("${config.code}")
    private Integer code;
    @Value("${config.username}")
    private String username;
    @Value("${config.message}")
    private String message;
    @Value("${config.listOfValues}")
    private List<String> listOfValues;
    @Value("#{'${config.listOfValues}'.toUpperCase().split(',')}")
    private List<String> valueList;
    @Value("#{'${config.listOfValues}'.toUpperCase()}")
    private String valueString;
    @Value("#{${config.valuesMap}}")
    private Map<String, Object> valuesMap;
    @Value("#{${config.valuesMap}.key1}")
    private String product;
    @Value("#{${config.valuesMap}.key2}")
    private String price;

    public ValueAnnotationController(Environment env) {
        this.env = env;
    }

    @GetMapping
    public Map<String, Object> getValue() {
        Map<String, Object> json = Map.of(
                "code", code,
                "username", username,
                "message", message,
                "listOfValues", listOfValues
        );
        return json;
    }

    @GetMapping("/2")
    public Map<String, Object> getValue2(@Value("${config.message}") String message) {
        Map<String, Object> json = new HashMap<>();
        json.put("code", code);
        json.put("code2", env.getProperty("config.code", Long.class));
        json.put("username", username);
        json.put("message", message);
        json.put("message2", env.getProperty("config.message"));
        json.put("listOfValues", listOfValues);
        json.put("valueList", valueList);
        json.put("valueString", valueString);
        json.put("valuesMap", valuesMap);
        json.put("product", product);
        json.put("price", price);
        return json;
    }
}