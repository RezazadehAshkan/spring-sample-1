package com.example.product_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import com.example.product_service.dto.CreateProductRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of(
            "message", "Hello from Product Service!",
            "service", "product-service"
        );
    }
    @PostMapping("/products")
    public ResponseEntity<Map<String, String>> createProduct(
            @Valid @RequestBody CreateProductRequest request) {

        return ResponseEntity.ok(
    Map.of("message", "Product created: " + request.name())
        );
    }
}