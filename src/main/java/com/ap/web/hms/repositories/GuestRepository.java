package com.ap.web.hms.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ap.web.hms.entities.Guest;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
    public Optional<Guest> findByPhoneNumber(String phoneNumber);
}
