package com.example.demo.hal.repository;

import com.example.demo.bkg.domain.Booking;
import com.example.demo.exh.domain.Exhbn;

import java.util.List;

import com.example.demo.hal.domain.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends JpaRepository<Hall, Integer> {
    public void update(Hall hall);
}
