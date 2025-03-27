package com.ftw.ecoscan.user;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

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

    public ResponseEntity<User> updateUser(Long id, User user) {
        User subject = repository.findById(id).orElseThrow(() -> new NoSuchElementException());

        subject.setData(user.getNome(), user.getEmail(), user.getSenha());
        User saved = repository.save(subject);

        return ResponseEntity.ok(saved);
    }

    public ResponseEntity<String> deleteUser(Long id) {
        repository.deleteById(id);

        return ResponseEntity.ok("success");
    }

}