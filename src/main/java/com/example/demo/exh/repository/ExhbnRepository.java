package com.example.demo.exh.repository;

import com.example.demo.bkg.domain.Booking;
import com.example.demo.exh.domain.Exhbn;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExhbnRepository extends JpaRepository<Exhbn, Integer> {
    public void update(Exhbn exhbn);
}
