package com.example.demo.exh.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.exh.domain.Exhbn;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class ExhbnRepositoryImpl extends QuerydslRepositorySupport implements IExhbnRepository {

	private final JPAQueryFactory qf;
	private final EntityManager em;
	public ExhbnRepositoryImpl(JPAQueryFactory qf, EntityManager em) {
		super(Exhbn.class);
		this.qf = qf;
		this.em = em;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Exhbn> findByExhbnTitle(String exhbnTitle) {
		return em.createNamedQuery("Exhbn.findByExhbnTitle")
					.setParameter("exhbnTitle", exhbnTitle)
					.getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Exhbn> findByExhbnGenre(String exhbnGenre) {
		return em.createNamedQuery("select e from Exhbn e where e.exhbn_genre like :exhbnGenre")
				.setParameter("exhbnGenre", exhbnGenre)
				.getResultList();
	}
	/*
	@SuppressWarnings("unchecked")
	@Override
	public List<BoardDto> findByMemNo(String memNo) {
		return  em.createQuery("select "
				+ "b.brd_no boardNum  "
				+ "b.title title "
				+ "b.content content "
				+ "b.written_date writtenDate "
				+ "m.mem_no memNo "
				+ "m.mem_name memName "
				+ "m.mem_email memEmail \n"
				+ "from Board b inner join Member m on b.mem_no = m.mem_no \n"
				+ "where b.mem_no like :memNo")
				.setParameter("memNo", memNo)
				.getResultList();
	} */
}
