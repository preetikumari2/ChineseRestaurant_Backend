package com.Prograd.springjwt.security.services;

import com.Prograd.springjwt.models.Image;
import com.Prograd.springjwt.repository.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImageServiceImpl implements ImageService{
    @Autowired
    private ImageRepo imageRepo;

    public ImageServiceImpl(ImageRepo imageRepo) {
        this.imageRepo = imageRepo;
    }
    @Override
    public Image saveImage(Image image)
    {
        return imageRepo.save(image);
    }
    @Override
    public void deleteImage(long id)
    {
        imageRepo.findById(id);
        imageRepo.deleteById(id);
    }

    @Override
    public List<Image> getAllImages() {
        return imageRepo.findAll();
    }

    @Override
    public Image getImageById(int id) {
        return null;
    }

    @Override
    public Image updateImage(Image image,
                             long id)
    {
        Image existingImage = imageRepo.findById(id).orElseThrow();

        existingImage.setName(image.getName());
        existingImage.setPrice(image.getPrice());
        existingImage.setImage(image.getImage());
        // save existing employee to DB
        imageRepo.save(existingImage);
        return existingImage;
//        return image;
    }


}
