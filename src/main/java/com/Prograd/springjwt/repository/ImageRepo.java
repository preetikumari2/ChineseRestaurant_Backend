package com.Prograd.springjwt.repository;

import com.Prograd.springjwt.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepo extends JpaRepository<Image, Long> {
   Optional<Image> findByName(String name);

}
