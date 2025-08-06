package com.namarahul.namarahulcollab.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class TestController {

    @GetMapping("/test")
    public String test() {

        return "Hello, this is a test endpoint!";
    }
}
