package com.ftw.ecoscan.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;
    
    @GetMapping()
    public ResponseEntity<List<Usuario>> getAll() {
        List<Usuario> usuarios = repository.findAll(); 
        
        return ResponseEntity.ok(usuarios);
    }
}
