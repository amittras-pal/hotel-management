package com.ap.web.hms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.web.hms.entities.Room;
import com.ap.web.hms.pojos.RoomReqBody;
import com.ap.web.hms.services.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    RoomService service;

    @GetMapping
    public List<Room> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Room addRoom(@RequestBody RoomReqBody roomReqBody) {
        return service.createRoom(roomReqBody);
    }

    @PutMapping
    public Room updateRoom(@RequestBody RoomReqBody roomReqBody) {
        return service.updateRoom(roomReqBody);
    }

}
