package com.example.demo.hal.repository;

import com.example.demo.exh.domain.Exhbn;
import com.example.demo.hal.domain.Hall;
import com.example.demo.hal.domain.HallDto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

interface IHallRepository {
	
}

public interface HallRepository extends JpaRepository<Hall, Integer>, IHallRepository {
	@Query("update hall set hall_closed = :hallClosed,"
			+ " hall_info = :#{#hallInfo},"
			+ " hall_image = :#{#hallImage},"
			+ " where hall_num = :#{#hallNum}")
	public int update(@Param("hall") Hall t);
	public List<Hall> findByHallNameAndHallLocation(String hallName, String hallLocation);
}
