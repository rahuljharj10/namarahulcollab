package com.namarahul.namarahulcollab.controller;

import com.namarahul.namarahulcollab.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController is a REST controller that provides an endpoint for testing purposes.
 * It uses the TestService to return a test message.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping
public class TestController {

    private final TestService testService;

    /**
     * This endpoint is used for testing purposes.
     *
     * @return A string message for testing purposes.
     */
    @GetMapping("/test")
    public String test() {

        return testService.getTestMessage();
    }
}
