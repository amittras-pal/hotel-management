package com.ap.web.hms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.web.hms.entities.Amenity;
import com.ap.web.hms.services.AmenityService;

@RestController
@RequestMapping("/api/amenities")
public class AmenityController {
    @Autowired
    AmenityService service;

    @GetMapping
    public List<Amenity> getAll() {
        return service.getAll();
    }

}
