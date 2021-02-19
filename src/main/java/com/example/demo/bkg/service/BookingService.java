package com.example.demo.bkg.service;

import java.util.List;
import java.util.stream.Collectors;
import static java.util.Comparator.comparing;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bkg.domain.Booking;
import com.example.demo.bkg.repository.BookingRepository;
import com.example.demo.cmm.service.DummyGenerator;
import com.example.demo.cmm.domain.Pagination;
import org.springframework.transaction.annotation.Transactional;

@Service @RequiredArgsConstructor
public class BookingService {
	final Booking booking;
	final BookingRepository bookingRepository;
	final DummyGenerator dummy;

    public List<Booking> findAll(Pagination page) {
    	return null; /*bookingRepository.findAll().stream()
    			.sorted(comparing(Booking::getBookNum).reversed())
    			.skip(page.getPageSize() * (page.getPageNum()-1))
    			.limit(page.getPageSize())
    			.collect(Collectors.toList());*/
    }
}
