package com.example.demo.rev.repository;

import java.util.List;

import com.example.demo.exh.domain.Exhbn;
import com.example.demo.rec.domain.Recommend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.rev.domain.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
    public void update(Review review);
}
