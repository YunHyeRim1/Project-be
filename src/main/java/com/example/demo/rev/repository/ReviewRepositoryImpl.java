package com.example.demo.rev.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.rev.domain.Review;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class ReviewRepositoryImpl extends QuerydslRepositorySupport implements ReviewCustomRepository {

	//private final JPAQueryFactory qf;
	public ReviewRepositoryImpl() {
		super(Review.class);
		//this.qf = qf;
	}

}
