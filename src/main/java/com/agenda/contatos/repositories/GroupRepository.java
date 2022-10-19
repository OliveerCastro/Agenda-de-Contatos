package com.agenda.contatos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.contatos.models.Group;


public interface GroupRepository extends JpaRepository<Group, Long>{

    List<Group> findByName(String name);

    Group getById(Long id);
    
}
