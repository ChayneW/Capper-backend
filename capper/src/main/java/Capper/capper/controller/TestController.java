package Capper.capper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;




@RestController
@RequestMapping("/api")
// @CrossOrigin(origins = "http://localhost:5173")
public class TestController {

    @Value("${origins}")
    private String origins;
    @CrossOrigin(origins = "${origins}")

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        // return "Hello, Message Spring Boot!";
        return Map.of("message", "Hello from Spring Boot!");
    }

}
