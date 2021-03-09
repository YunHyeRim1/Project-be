package com.example.demo.rev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.rev.domain.Review;
import com.example.demo.rev.repository.ReviewRepository;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class ReviewServiceImpl extends AbstractService<Review> implements ReviewService {
	final ReviewRepository reviewRepository;
	
	@Override 
	public long save(Review review) {
		return (reviewRepository.save(review) != null) ? 1 : 0;
	}
	@Override 
	public long delete(Review review) {
		reviewRepository.delete(review); 
		return(getOne(review.getReviewNum()) == null) ? 1 : 0;
	}
	@Override 
	public long count() {
		return reviewRepository.count();
	}
	@Override 
    public Review getOne(long id) {
    	return getOne(id);
    }
	@Override 
    public Optional<Review> findById(long id) {
    	return reviewRepository.findById(id);
	}
    @Override 
    public boolean existsById(long id) {
    	return reviewRepository.existsById(id);
    }
    @Override 
    public List<Review> findAll() {
    	return reviewRepository.findAll();
    }
    
}
