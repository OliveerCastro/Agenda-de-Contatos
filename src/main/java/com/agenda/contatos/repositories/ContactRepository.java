package com.agenda.contatos.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.agenda.contatos.models.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    
    @Query(value = "SELECT * FROM contacts c WHERE c.u_id = :u_id", nativeQuery = true)
    List<Contact> findByUser(@Param("u_id") long id);

    Contact findById(long id);

    @Transactional
    void deleteByUserId(long userId);
}