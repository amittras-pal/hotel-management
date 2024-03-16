package com.ap.web.hms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.web.hms.entities.Hotel;
import com.ap.web.hms.services.HotelService;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {
	
	@Autowired
	HotelService service;
	
	@GetMapping
	public Hotel get() {
		return service.getDetails();
	}
	
	@PostMapping
	public Hotel create(@RequestBody @Validated Hotel hotel) {
		return service.saveHotel(hotel);
	}
	
	@PutMapping
	public Hotel edit(@RequestBody Hotel hotel) {
		return service.saveHotel(hotel);
	}
}
