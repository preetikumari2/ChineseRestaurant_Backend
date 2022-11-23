package com.Prograd.springjwt.security.services;

import com.Prograd.springjwt.models.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {
    Contact saveContact(Contact contact);
    List<Contact> getAllContacts();
    Contact getContactById(int id);
    void deleteContact(int id);
}
