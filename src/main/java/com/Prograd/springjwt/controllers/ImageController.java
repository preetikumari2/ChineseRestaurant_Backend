package com.Prograd.springjwt.controllers;

import com.Prograd.springjwt.models.Image;
import com.Prograd.springjwt.repository.ImageRepo;
import com.Prograd.springjwt.security.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000",allowedHeaders = "*")
@RestController
@RequestMapping("/api/test/image")
public class ImageController {
    @Autowired
    private ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Image> saveImage(@RequestBody Image image)
    {
        System.out.println(image);
        return new ResponseEntity<Image>(imageService.saveImage(image), HttpStatus.CREATED);
    }
    @GetMapping("/allimages")
    public List<Image> getAllImages()
    {
        return imageService.getAllImages();
    }
    @GetMapping("{id}")
    public ResponseEntity<Image> getImageById(@PathVariable("id")int id)
    {
        return new ResponseEntity<Image>(imageService.getImageById(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Image> updateEmployee(@PathVariable("id") int id,@RequestBody Image image)
    {
//        System.out.println("Hi");
        return new ResponseEntity<Image>(imageService.updateImage(image,id),HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteImage(@PathVariable("id")int id)
    {
        imageService.deleteImage(id);
        return new ResponseEntity<String>("Image deleted successfully",HttpStatus.OK);
    }
}

