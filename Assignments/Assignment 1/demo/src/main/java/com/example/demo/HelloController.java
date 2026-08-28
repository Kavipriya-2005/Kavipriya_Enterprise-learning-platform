package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/products")
    public String hello() {
    return "Product";
    }
    @PostMapping("/products")
public String welcome(@RequestBody User user) {
    return "Products added " + user.getName();
}
}