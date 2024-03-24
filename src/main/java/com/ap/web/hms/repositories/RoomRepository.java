package com.ap.web.hms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ap.web.hms.entities.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
