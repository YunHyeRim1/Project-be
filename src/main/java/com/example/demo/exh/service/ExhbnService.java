package com.example.demo.exh.service;

import java.util.List;

import com.example.demo.exh.domain.Exhbn;

public interface ExhbnService {

	public List<Exhbn> findByExhbnTitle(String exhbnTitle);
	
}
