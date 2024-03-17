package com.ap.web.hms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ap.web.hms.entities.RoomType;

@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType, Long> {

    public RoomType findByName(String name);

}
