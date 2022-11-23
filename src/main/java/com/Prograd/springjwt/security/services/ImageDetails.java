//package com.Prograd.springjwt.security.services;
//
//import com.Prograd.springjwt.models.Image;
//import com.Prograd.springjwt.repository.ImageRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ImageDetails implements UserDetailsService{
//    @Autowired
//    private ImageRepo imageRepo;
//    @Override
//    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
//       Image image= this.imageRepo.findByName(name).orElseThrow();
//        return image;
//    }
//}
