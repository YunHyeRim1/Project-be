package com.example.demo.exh.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.exh.domain.Exhbn;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class ExhbnRepositoryImpl extends QuerydslRepositorySupport implements ExhbnCustomRepository {

	//private final JPAQueryFactory qf;
	private final EntityManager em;
	public ExhbnRepositoryImpl(EntityManager em) {
		super(Exhbn.class);
		//this.qf = qf;
		this.em = em;
	}
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Exhbn> findByExhbnNum(long exhbnNum) {
//		return em.createQuery("select e from Exhbn e where e.exhbn_num like :exhbnNum")
//					.setParameter("exhbnNum", exhbnNum)
//					.getResultList();
//	}

}
