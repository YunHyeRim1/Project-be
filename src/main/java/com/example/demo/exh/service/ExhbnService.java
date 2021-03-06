package com.example.demo.exh.service;

import java.util.List;

import com.example.demo.exh.domain.Exhbn;

public interface ExhbnService {
	public long update(String exhbnTitle, String startDate, String endDate, String exhbnGenre, 
						String exhbnPrice, String exhbnArtist, String exhbnContent, String exhbnImage,
						String hallLocation, long exhbnNum);
						
	public Exhbn findByExhbnNum(long exhbnNum);
	
}
