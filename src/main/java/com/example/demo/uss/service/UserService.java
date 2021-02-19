package com.example.demo.uss.service;

import java.util.ArrayList;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cmm.service.DummyGenerator;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;

@Service @RequiredArgsConstructor
public class UserService {

	final UserRepository userRepository;

}
