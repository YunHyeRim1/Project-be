package com.example.demo.bkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bkg.domain.Booking;

interface BookingCustomRepository {
	
}

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingCustomRepository {

}
