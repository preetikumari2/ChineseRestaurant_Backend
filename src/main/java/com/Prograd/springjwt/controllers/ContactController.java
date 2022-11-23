package com.Prograd.springjwt.controllers;

import com.Prograd.springjwt.models.Contact;
import com.Prograd.springjwt.security.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/test/contact")
public class ContactController {
    @Autowired
    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Contact> saveBooking(@RequestBody Contact contact)
    {
        System.out.println(contact);
        return new ResponseEntity<Contact>(contactService.saveContact(contact), HttpStatus.CREATED);
    }
    @GetMapping("/allcontacts")
    public List<Contact> getAllContacts()
    {
        return contactService.getAllContacts();
    }
    @GetMapping("{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable("id")int id)
    {
        return new ResponseEntity<Contact>(contactService.getContactById(id),HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteContact(@PathVariable("id")int id)
    {
        contactService.deleteContact(id);
        return new ResponseEntity<String>("Contact deleted successfully",HttpStatus.OK);
    }
}
