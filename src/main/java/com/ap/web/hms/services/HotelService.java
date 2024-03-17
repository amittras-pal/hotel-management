package com.ap.web.hms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.web.hms.entities.Hotel;
import com.ap.web.hms.repositories.HotelRepository;

@Service
public class HotelService {

	@Autowired
	HotelRepository repo;

	public Hotel saveHotel(Hotel hotel) {
		return repo.save(hotel);
	}

	public Hotel getDetails() {
		return repo.findAll().get(0);
	}
}
