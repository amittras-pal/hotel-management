package com.ap.web.hms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ap.web.hms.entities.Amenity;

@Repository
public interface AmenityRepository extends JpaRepository<Amenity, Long> {
    public Amenity findByName(String name);

    public Amenity findById(long id);
}
