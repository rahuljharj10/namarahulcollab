package com.namarahul.namarahulcollab.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping
public class InputController {

    //------------------------------------------------------------------------------------------------------------------//

    /**
     * Test endpoint for verifying API functionality with a path variable.
     * Request URL: http://localhost:8080/path-variable/user/1
     */
    @GetMapping("path-variable-one/user/{id}")
    public ResponseEntity<String> testPathVariableOne(@PathVariable Long id) {

        System.out.println("Accessed /path-variable/user/{id} endpoint with id: " + id);

        return ResponseEntity.ok().body("API is working fine!");
    }

    /**
     * Test endpoint for verifying API functionality with a path variable.
     * Request URL: http://localhost:8080/path-variable/user/1
     */
    @GetMapping("path-variable-second/user/{id}")
    public ResponseEntity<String> testPathVariableSecond(@PathVariable("id") Long userId) {

        System.out.println("Accessed /path-variable/user/{id} endpoint with id: " + userId);

        return ResponseEntity.ok().body("API is working fine!");
    }

    /**
     * Test endpoint for verifying API functionality with a path variable.
     * Request URL: http://localhost:8080/path-variable-third/1/rahul
     */
    @GetMapping("path-variable-third/{id}/{name}")
    public ResponseEntity<String> testPathVariableSecond(@PathVariable String id, @PathVariable String name) {

        System.out.println("Accessed /path-variable-third/{id}/{name} endpoint with id: " + id + " and name: " + name);

        return ResponseEntity.ok().body("API is working fine!");
    }

    //------------------------------------------------------------------------------------------------------------------//

    /**
     * Test endpoint for verifying API functionality with a request parameter.
     * Request URL: http://localhost:8080/request-param-one/user?id=1212
     */
    @GetMapping("request-param-one/user")
    public ResponseEntity<String> testRequestParamOne(@RequestParam Long id) {

        System.out.println("Accessed /request-param-one/user endpoint with id: " + id);

        return ResponseEntity.ok().body("API is working fine!");
    }

    /**
     * Test endpoint for verifying API functionality with a request parameter.
     * Request URL: http://localhost:8080/path-variable-and-request-param/user/12?name=rahul
     */
    @GetMapping("path-variable-and-request-param/user/{id}")
    public ResponseEntity<String> testRequestParamSecond(@PathVariable Long id, @RequestParam String name) {

        System.out.println("Accessed /path-variable-and-request-param/user/{id} endpoint with id: " + id + " and name: " + name);

        return ResponseEntity.ok().body("API is working fine!");
    }

    /**
     * Test endpoint for verifying API functionality with a request parameter.
     * Request URL: http://localhost:8080/request-param-third/user?id=rahul&id=namrata
     */
    @GetMapping("request-param-third/user")
    public ResponseEntity<String> testRequestParamThird(@RequestParam List<String> id) {

        System.out.println("Accessed /request-param-third/user endpoint with ids: " + id);

        return ResponseEntity.ok().body("API is working fine!");
    }

    //------------------------------------------------------------------------------------------------------------------//

    @PostMapping(value = "file/upload" , consumes = "multipart/form-data")
    public String uploadFile(@RequestParam MultipartFile file) throws IOException {

        String uploadDir = "D:/swaggerFileUploads/";
        Path path = Paths.get(uploadDir + file.getOriginalFilename());
        Files.createDirectories(path.getParent()); // Create folder if not exists
        Files.write(path, file.getBytes());

        return "File uploaded: " + file.getOriginalFilename();
    }
}
