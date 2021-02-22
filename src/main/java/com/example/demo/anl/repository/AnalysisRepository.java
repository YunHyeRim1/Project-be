package com.example.demo.anl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.anl.domain.Analysis;

public interface AnalysisRepository extends JpaRepository<Analysis, Integer> {
	public void update(Analysis analysis);
}
