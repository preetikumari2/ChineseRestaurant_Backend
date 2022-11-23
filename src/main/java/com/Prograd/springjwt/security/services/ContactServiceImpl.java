package com.Prograd.springjwt.security.services;

import com.Prograd.springjwt.models.Contact;
import com.Prograd.springjwt.repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
    private ContactRepo contactRepo;

    public ContactServiceImpl(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }
    @Override
    public Contact saveContact(Contact contact)
    {
        return contactRepo.save(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepo.findAll();
    }
    @Override
    public void deleteContact(int id)
    {
        contactRepo.findById(id);
        contactRepo.deleteById(id);
    }

    @Override
    public Contact getContactById(int id) {
        return null;
    }
}
