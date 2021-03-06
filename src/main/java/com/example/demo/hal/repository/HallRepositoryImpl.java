package com.example.demo.hal.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.hal.domain.Hall;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class HallRepositoryImpl extends QuerydslRepositorySupport implements HallCustomRepository {

	//private final JPAQueryFactory qf;
	private final EntityManager em;
	public HallRepositoryImpl(EntityManager em) {
		super(Hall.class);
		//this.qf = qf;
		this.em = em;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Hall> findByLocation(String location) {
		return em.createQuery("select h from Hall h where h.hall_location like :hallLocation")
				.setParameter("hallLocation", location).getResultList();
	}
}
