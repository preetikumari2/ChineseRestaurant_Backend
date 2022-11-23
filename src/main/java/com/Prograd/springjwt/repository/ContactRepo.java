package com.Prograd.springjwt.repository;

import com.Prograd.springjwt.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Integer> {
}
