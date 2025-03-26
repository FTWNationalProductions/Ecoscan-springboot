package com.ftw.ecoscan.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @GetMapping()
    public ResponseEntity<List<User>> getAll() {
        List<User> usuarios = repository.findAll();

        return ResponseEntity.ok(usuarios);
    }

    public ResponseEntity<User> getById(Long id) {
        User user = repository.findById(id).orElseThrow();

        return ResponseEntity.ok(user);
    }

    public ResponseEntity<User> createUser(User user) {
        User saved = repository.save(user);

        return ResponseEntity.ok(saved);
    }

}