package com.example.demo.bkg.controller;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bkg.domain.Booking;
import com.example.demo.bkg.service.BookingServiceImpl;
import com.example.demo.cmm.controller.AbstractController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController 
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/bookings")
public class BookingController extends AbstractController<Booking> {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	final BookingServiceImpl service;

	@PostMapping("/add")
	public ResponseEntity<Long> save(@RequestBody Booking t) {
		return ResponseEntity.ok(service.save(t));
	}
	
	@PutMapping("/update")
	public ResponseEntity<Long> update(@RequestParam(value = "bookName", required = false) String bookName, 
			@RequestParam(value = "bookEmail", required = false) String bookEmail, 
			@RequestParam(value = "bookPnumber", required = false) String bookPnumber, 
			@RequestParam(value = "bookNum", required = false) long bookNum) {
		logger.info("수정 정보: "+ bookName + bookEmail + bookPnumber + bookNum);
		return ResponseEntity.ok(service.update(bookName, bookEmail, bookPnumber, bookNum)); 
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Long> delete(@RequestBody Booking t) {
		return ResponseEntity.ok(service.delete(t));
	}

	@GetMapping("/count")
	public ResponseEntity<Long> count() {
		return ResponseEntity.ok(service.count());
	}

	@GetMapping("/one/{id}")
	public ResponseEntity<Booking> getOne(@PathVariable long id) {
		return ResponseEntity.ok(service.getOne(id));
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Booking>> findById(@PathVariable long id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@GetMapping("/exists/{id}")
	public ResponseEntity<Boolean> existsById(@PathVariable long id) {
		return ResponseEntity.ok(service.existsById(id));
	}

	@GetMapping("/all")
	public ResponseEntity<List<Booking>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

}
