package com.ftw.ecoscan.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftw.ecoscan.user.User;

import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService service;
    
    @GetMapping()
    public ResponseEntity<User> auth(@RequestBody User user) {
        return service.auth(user);
    }
    
}
