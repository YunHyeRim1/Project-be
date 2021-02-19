package com.example.demo.bkg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bkg.domain.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
    public void update(Booking booking);
}
