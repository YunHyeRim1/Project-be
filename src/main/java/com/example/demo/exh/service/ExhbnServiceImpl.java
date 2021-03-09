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
	public long save(Exhbn e) {
		return (exhbnrepository.save(e) != null) ? 1 : 0;
	}
	@Override 
	public long delete(Exhbn e) {
		exhbnrepository.delete(e); 
		return(getOne(e.getExhbnNum()) == null) ? 1 : 0;
	}
	@Override 
	public long count() {
		return exhbnrepository.count();
	}
	@Override 
    public Exhbn getOne(long id) {
    	return exhbnrepository.getOne(id);
    }
	@Override 
    public Optional<Exhbn> findById(long id) {
    	return exhbnrepository.findById(id);
	}
	@Override 
    public boolean existsById(long id) {
    	return exhbnrepository.existsById(id);
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
