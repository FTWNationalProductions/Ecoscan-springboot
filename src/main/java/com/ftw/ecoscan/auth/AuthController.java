package com.ftw.ecoscan.auth;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftw.ecoscan.user.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService service;

    @PostMapping()
    public ResponseEntity<User> auth(@RequestBody User user) {
        try {
            return service.auth(user);
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }

}
