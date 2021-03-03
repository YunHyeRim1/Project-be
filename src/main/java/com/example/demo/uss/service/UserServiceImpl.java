package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class UserServiceImpl  extends AbstractService<User> implements UserService {
	final UserRepository userRepository;
	
	@Override 
	public int save(User user) {
		return (userRepository.save(user) != null) ? 1 : 0;
	}
	@Override 
	public int delete(User user) {
		userRepository.delete(user); 
		return(getOne(user.getUserNum()) == null) ? 1 : 0;
	}
	@Override 
	public int count() {
		return (int)userRepository.count();
	}
	@Override 
    public User getOne(int id) {
    	return getOne(id);
    }
	@Override 
    public Optional<User> findById(int id) {
    	return userRepository.findById(id);
	}
    @Override 
    public boolean existsById(int id) {
    	return userRepository.existsById(id);
    }
    @Override 
    public List<User> findAll() {
    	return userRepository.findAll();
    }
    
}
