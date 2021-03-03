package com.example.demo.anl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.anl.domain.Analysis;
import com.example.demo.anl.repository.AnalysisRepository;
import com.example.demo.cmm.service.AbstractService;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class AnalysisServiceImpl extends AbstractService<Analysis> implements AnalysisService {
	final AnalysisRepository analysisRepository;
	
	@Override 
	public int save(Analysis Analysis) {
		return (analysisRepository.save(Analysis) != null) ? 1 : 0;
	}
	@Override 
	public int delete(Analysis Analysis) {
		analysisRepository.delete(Analysis); 
		return(getOne(Analysis.getAnalNum()) == null) ? 1 : 0;
	}
	@Override 
	public int count() {
		return (int)analysisRepository.count();
	}
	@Override 
    public Analysis getOne(int id) {
    	return getOne(id);
    }
	@Override 
    public Optional<Analysis> findById(int id) {
    	return analysisRepository.findById(id);
	}
    @Override 
    public boolean existsById(int id) {
    	return analysisRepository.existsById(id);
    }
    @Override 
    public List<Analysis> findAll() {
    	return analysisRepository.findAll();
    }
    
}