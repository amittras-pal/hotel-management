package com.ap.web.hms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.web.hms.entities.Room;
import com.ap.web.hms.entities.RoomType;
import com.ap.web.hms.pojos.RoomReqBody;
import com.ap.web.hms.repositories.RoomRepository;
import com.ap.web.hms.repositories.RoomTypeRepository;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    RoomTypeRepository rTypeRepository;

    public List<Room> getAll() {
        return roomRepository.findAll();
    }

    public Room createRoom(RoomReqBody reqBody) {
        RoomType type = rTypeRepository.findById(reqBody.typeId);
        Room room = new Room();

        room.setName(reqBody.name);
        room.setAvailable(true);
        room.setSpeciality(reqBody.speciality);
        room.setType(type);

        return roomRepository.save(room);
    }

    public Room updateRoom(RoomReqBody reqBody) {
        Room room = roomRepository.findById(reqBody.id).get();

        room.setName(reqBody.name);
        room.setAvailable(true);
        room.setSpeciality(reqBody.speciality);
        if (room.getType().getId() != reqBody.typeId) {
            room.setType(rTypeRepository.findById(reqBody.typeId));
        }

        return roomRepository.save(room);
    }
}
