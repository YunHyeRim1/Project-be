package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;
import com.example.demo.uss.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class UserServiceImpl  extends AbstractService<User> implements UserService {
	final UserRepository userRepository;
	
	@Override 
	public long save(User user) {
		return (userRepository.save(user) != null) ? 1 : 0;
	}
	@Override 
	public long delete(User user) {
		userRepository.delete(user); 
		return(getOne(user.getUserNum()) == null) ? 1 : 0;
	}
	@Override 
	public long count() {
		return userRepository.count();
	}
	@Override 
    public User getOne(long id) {
    	return getOne(id);
    }
	@Override 
    public Optional<User> findById(long id) {
    	return userRepository.findById(id);
	}
    @Override 
    public boolean existsById(long id) {
    	return userRepository.existsById(id);
    }
    @Override 
    public List<User> findAll() {
    	return userRepository.findAll();
    }
	@Override
	public UserDetails loadUserByUsername(String useridOrEmail) {
		return UserDto.create(
				userRepository.findByUseridOrEmail(useridOrEmail, useridOrEmail)
				.orElseThrow(() -> new UsernameNotFoundException("아이디나 이메일을 찾을 수 없음.."))
				);
	}
	
	@Transactional
	public UserDetails loadUserById(Long id) {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with id : " + id));
		return UserDto.create(user);
	}
}
