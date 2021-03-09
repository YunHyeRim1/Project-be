package com.example.demo.bkg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.bkg.domain.Booking;
import com.example.demo.bkg.repository.BookingRepository;
import com.example.demo.cmm.service.AbstractService;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class BookingServiceImpl extends AbstractService<Booking> implements BookingService {
	final BookingRepository bookingRepository;
	
	@Override 
	public long save(Booking booking) {
		return (bookingRepository.save(booking) != null) ? 1 : 0;
	}
	@Override 
	public long delete(Booking booking) {
		bookingRepository.delete(booking); 
		return(getOne(booking.getBookNum()) == null) ? 1 : 0;
	}
	@Override 
	public long count() {
		return bookingRepository.count();
	}
	@Override 
    public Booking getOne(long id) {
    	return getOne(id);
    }
	@Override 
    public Optional<Booking> findById(long id) {
    	return bookingRepository.findById(id);
	}
    @Override 
    public boolean existsById(long id) {
    	return bookingRepository.existsById(id);
    }
    @Override 
    public List<Booking> findAll() {
    	return bookingRepository.findAll();
    }
    
}
