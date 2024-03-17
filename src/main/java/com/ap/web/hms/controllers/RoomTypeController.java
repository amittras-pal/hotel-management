package com.ap.web.hms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.web.hms.entities.RoomType;
import com.ap.web.hms.pojos.RoomTypeReqBody;
import com.ap.web.hms.services.RoomTypeService;

@RestController
@RequestMapping("/api/room-type")
public class RoomTypeController {

    @Autowired
    RoomTypeService service;

    @PostMapping
    public RoomType createRoomType(@RequestBody RoomTypeReqBody requestBody) {
        return service.createRoomType(requestBody);
    }

    @GetMapping
    public List<RoomType> getAll() {
        return service.getAll();
    }

}
