package com.example.demo.anl.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.anl.domain.Analysis;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class AnalysisRepositoryImpl extends QuerydslRepositorySupport implements AnalysisCustomRepository {

	//private final JPAQueryFactory qf;
	public AnalysisRepositoryImpl() {
		super(Analysis.class);
		//this.qf = qf;
	}

}
