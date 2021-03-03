package com.example.demo.rec.repository;

import com.example.demo.bkg.domain.Booking;
import com.example.demo.exh.domain.Exhbn;

import java.util.List;

import com.example.demo.rec.domain.Recommend;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface IRecommendRepository {
	
}

public interface RecommendRepository extends JpaRepository<Recommend, Integer>, IRecommendRepository {

}
