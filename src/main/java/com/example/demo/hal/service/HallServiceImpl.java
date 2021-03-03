package com.example.demo.hal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.hal.domain.Hall;
import com.example.demo.hal.repository.HallRepository;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class HallServiceImpl extends AbstractService<Hall> implements HallService {
	final HallRepository hallRepository;
	
	@Override 
	public int save(Hall hall) {
		return (hallRepository.save(hall) != null) ? 1 : 0;
	}
	@Override 
	public int delete(Hall hall) {
		hallRepository.delete(hall); 
		return(getOne(hall.getHallNum()) == null) ? 1 : 0;
	}
	@Override 
	public int count() {
		return (int)hallRepository.count();
	}
	@Override 
    public Hall getOne(int id) {
    	return getOne(id);
    }
	@Override 
    public Optional<Hall> findById(int id) {
    	return hallRepository.findById(id);
	}
    @Override 
    public boolean existsById(int id) {
    	return hallRepository.existsById(id);
    }
    @Override 
    public List<Hall> findAll() {
    	return hallRepository.findAll();
    }
}
