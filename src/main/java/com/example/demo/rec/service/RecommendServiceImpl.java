package com.example.demo.rec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.rec.domain.Recommend;
import com.example.demo.rec.repository.RecommendRepository;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class RecommendServiceImpl extends AbstractService<Recommend> implements RecommendService {
	final RecommendRepository recommendRepository;

	@Override 
	public long save(Recommend Recommend) {
		return (recommendRepository.save(Recommend) != null) ? 1 : 0;
	}
	@Override 
	public long delete(Recommend Recommend) {
		recommendRepository.delete(Recommend); 
		return(getOne(Recommend.getRecNum()) == null) ? 1 : 0;
	}
	@Override 
	public long count() {
		return recommendRepository.count();
	}
	@Override 
    public Recommend getOne(long id) {
    	return getOne(id);
    }
	@Override 
    public Optional<Recommend> findById(long id) {
    	return recommendRepository.findById(id);
	}
    @Override 
    public boolean existsById(long id) {
    	return recommendRepository.existsById(id);
    }
    @Override 
    public List<Recommend> findAll() {
    	return recommendRepository.findAll();
    }
    
}
