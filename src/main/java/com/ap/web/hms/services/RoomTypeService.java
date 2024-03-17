package com.ap.web.hms.services;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.web.hms.entities.Amenity;
import com.ap.web.hms.entities.RoomType;
import com.ap.web.hms.pojos.RoomTypeReqBody;
import com.ap.web.hms.repositories.AmenityRepository;
import com.ap.web.hms.repositories.RoomTypeRepository;

@Service
public class RoomTypeService {

    @Autowired
    RoomTypeRepository roomTypeRepo;
    @Autowired
    AmenityRepository amenityRepo;

    public RoomTypeService() {
    }

    public RoomType createRoomType(RoomTypeReqBody requestBody) {
        RoomType roomType = new RoomType();
        roomType.setId(requestBody.id);
        roomType.setName(requestBody.name);
        roomType.setCapacity(requestBody.capacity);
        roomType.setRatePerNight(requestBody.ratePerNight);
        roomType.setAmenities(requestBody.amenities.stream().map(a -> {
            Amenity amenity = a;
            if (amenity.getId() > 0) {
                amenity = amenityRepo.findById(amenity.getId());
            }
            amenity.addRoomType(roomType);
            return amenity;
        }).collect(Collectors.toSet()));

        return roomTypeRepo.save(roomType);
    }

    public java.util.List<RoomType> getAll() {
        return roomTypeRepo.findAll();
    }
}
