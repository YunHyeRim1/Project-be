package com.example.demo.cmm.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.exh.domain.Exhbn;
import com.example.demo.hal.domain.Hall;

public abstract class AbstractService<T> {
	public abstract int save(T t);
	public abstract int delete(T t);
	public abstract int count();
	public abstract T getOne(int id);
    public abstract Optional<T> findById(int id);
    public abstract boolean existsById(int id);
    public abstract List<T> findAll();

}
