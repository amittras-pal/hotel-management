package com.ap.web.hms.pojos;

import java.util.Set;

import com.ap.web.hms.entities.Amenity;

public class RoomTypeReqBody {
    public int id;
    public String name;
    public int capacity;
    public int ratePerNight;
    public Set<Amenity> amenities;

}
