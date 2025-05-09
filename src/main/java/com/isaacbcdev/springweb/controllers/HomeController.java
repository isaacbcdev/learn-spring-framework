package com.isaacbcdev.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /*
     * Difference between redirect and forward:
     * - Redirect: The server sends a response to the client with a new URL, and the client makes a new request to that URL.
     * This is typically used when you want to redirect the user to a different page after a form submission or some other action.
     * - Forward: The server internally forwards the request to another resource (e.g., a JSP page or another controller method) without the client being aware of it.
     * This is typically used when you want to display a different view without changing the URL in the browser.
     * */

    @GetMapping({"", "/", "/home"})
    public String home() {
        return "redirect:/list";
    }
}