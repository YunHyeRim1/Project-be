package com.example.demo.rec.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.anl.service.AnalysisServiceImpl;
import com.example.demo.cmm.controller.AbstractController;
import com.example.demo.rec.domain.Recommend;
import com.example.demo.rec.service.RecommendServiceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequiredArgsConstructor 
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/recommends")
public class RecommendController extends AbstractController<Recommend> {
	final RecommendServiceImpl service;

	@PostMapping("/save")
	public ResponseEntity<Integer> save(Recommend t) {
		return ResponseEntity.ok(service.save(t));
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Integer> delete(Recommend t) {
		return ResponseEntity.ok(service.delete(t));
	}

	@GetMapping("/count")
	public ResponseEntity<Integer> count() {
		return ResponseEntity.ok(service.count());
	}

	@GetMapping("/one/{id}")
	public ResponseEntity<Recommend> getOne(int id) {
		return ResponseEntity.ok(service.getOne(id));
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Recommend>> findById(int id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@GetMapping("/exists/{id}")
	public ResponseEntity<Boolean> existsById(int id) {
		return ResponseEntity.ok(service.existsById(id));
	}

	@GetMapping("/all")
	public ResponseEntity<List<Recommend>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

}
