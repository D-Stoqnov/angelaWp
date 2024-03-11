package com.website.angelaWp.contoller.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @GetMapping("/common_endpoint")
    public ResponseEntity<String> commonEndpoint() {
        // Implementation of common endpoint goes here
        return ResponseEntity.ok("This endpoint is accessible to all authenticated users");
    }
}
