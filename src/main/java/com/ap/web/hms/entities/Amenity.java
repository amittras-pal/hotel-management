package com.ap.web.hms.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "amenities")
public class Amenity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "amenity_id")
    private long id;

    @Column(name = "amenity_name", unique = true, columnDefinition = "character varying(30) NOT NULL")
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "amenities")
    private Set<RoomType> roomTypes = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<RoomType> getRoomTypes() {
        return roomTypes;
    }

    public void setRoomTypes(Set<RoomType> roomTypes) {
        this.roomTypes = roomTypes;
    }

    public void addRoomType(RoomType roomType) {
        this.roomTypes.add(roomType);
    }

    @Override
    public String toString() {
        return "Amenity [id=" + id + ", name=" + name + "]";
    }

}
