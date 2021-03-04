package com.example.demo.hal.service;

import java.util.List;

import com.example.demo.hal.domain.Hall;

public interface HallService {
	public List<Hall> findByHallNameAndHallLocation(String name, String location);
	public int update(String hallClosed, int hallNum);
	
}
