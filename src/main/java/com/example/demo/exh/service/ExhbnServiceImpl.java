package com.example.demo.exh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.exh.domain.Exhbn;
import com.example.demo.exh.repository.ExhbnRepository;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class ExhbnServiceImpl extends AbstractService<Exhbn> implements ExhbnService {
	final ExhbnRepository exhbnrepository;
	
	@Override 
	public int save(Exhbn exhbn) {
		return (exhbnrepository.save(exhbn) != null) ? 1 : 0;
	}
	@Override 
	public int delete(Exhbn exhbn) {
		exhbnrepository.delete(exhbn); 
		return(getOne(exhbn.getExhbnNum()) == null) ? 1 : 0;
	}
	@Override 
	public int count() {
		return (int)exhbnrepository.count();
	}
	@Override 
    public Exhbn getOne(int exhbnNum) {
    	return exhbnrepository.getOne(exhbnNum);
    }
	@Override 
    public Optional<Exhbn> findById(int exhbnNum) {
    	return exhbnrepository.findById(exhbnNum);
	}
	@Override 
    public boolean existsById(int exhbnNum) {
    	return exhbnrepository.existsById(exhbnNum);
    }
	@Override 
    public List<Exhbn> findAll() {
    	return exhbnrepository.findAll();
    }
    @Override
	public List<Exhbn> findByExhbnTitle(String exhbnTitle) {
		return exhbnrepository.findByExhbnTitle(exhbnTitle);
	}
}
