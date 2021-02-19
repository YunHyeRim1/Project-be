package com.example.demo.uss.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.domain.Messenger;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;
import com.example.demo.uss.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController @RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    final UserService userService;
    final UserRepository userRepository;
    

    @PostMapping("")
    public Messenger register(@RequestBody User user) {
        userRepository.save(user);
        return Messenger.SUCCESS;
    }
    
    @PostMapping("/login")
    public User login(@RequestBody User user) {
        /*return userRepository.login(user);*/
        return null;
    }
}
