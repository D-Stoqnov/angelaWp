package com.website.angelaWp.contoller.rest;

import com.website.angelaWp.model.AuthenticationResponse;
import com.website.angelaWp.model.User;
import com.website.angelaWp.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> registerUser(@RequestBody User user) {
        AuthenticationResponse response = authenticationService.register(user);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> authenticateUser(@RequestBody User user) {
        AuthenticationResponse response = authenticationService.authenticate(user);
        return ResponseEntity.ok(response);
    }
}
