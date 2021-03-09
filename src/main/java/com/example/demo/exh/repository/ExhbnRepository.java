package com.example.demo.exh.repository;

import com.example.demo.exh.domain.Exhbn;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

interface ExhbnCustomRepository {

	List<Exhbn> findByExhbnTitle(String exhbnTitle);
	List<Exhbn> findByExhbnGenre(String exhbnGenre);
	
}

public interface ExhbnRepository extends JpaRepository<Exhbn, Long>, ExhbnCustomRepository {

}
