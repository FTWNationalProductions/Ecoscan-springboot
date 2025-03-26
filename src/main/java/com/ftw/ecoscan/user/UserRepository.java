package com.ftw.ecoscan.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmailAndSenha(String email, String senha);
}