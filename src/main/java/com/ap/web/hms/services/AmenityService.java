package com.ap.web.hms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.web.hms.entities.Amenity;
import com.ap.web.hms.repositories.AmenityRepository;

@Service
public class AmenityService {

    @Autowired
    AmenityRepository repo;

    public List<Amenity> getAll() {
        return repo.findAll();
    }
}
