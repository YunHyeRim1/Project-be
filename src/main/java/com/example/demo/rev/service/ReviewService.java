package com.example.demo.rev.service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.rev.domain.Review;
import com.example.demo.rev.repository.ReviewRepository;

@Service @RequiredArgsConstructor
public class ReviewService {

	final ReviewRepository reviewRepository;
	
}
