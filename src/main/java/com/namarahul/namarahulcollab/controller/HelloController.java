package com.namarahul.namarahulcollab.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for handling requests to the hello page.
 */
@Controller
@Slf4j
public class HelloController {

    /**
     * Handles GET requests to /hello and returns the hello Thymeleaf template.
     * Adds a message attribute to the model for display on the page.
     *
     * @param model the model to pass attributes to the view
     * @return the name of the Thymeleaf template to render
     */
    @GetMapping("/hello")
    public String hello(Model model) {

        log.info("Accessed /hello endpoint");

        model.addAttribute("message", "Hello from Thymeleaf Controller!");

        log.info("Returning 'hello' view");

        return "hello";
    }
}
