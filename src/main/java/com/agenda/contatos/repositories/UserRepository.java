package com.agenda.contatos.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.contatos.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

    List<User> findByUsername(String username);

    User findById(Long id);
    
}