package com.ftw.ecoscan.auth;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ftw.ecoscan.user.User;
import com.ftw.ecoscan.user.UserRepository;

@Service
public class AuthService {
    @Autowired
    private UserRepository repository;

    public ResponseEntity<User> auth(User user) {
        User login = repository.findByEmailAndSenha(user.getEmail(), user.getSenha())
                .orElseThrow(() -> new NoSuchElementException());
        return ResponseEntity.ok(login);
    }

}
