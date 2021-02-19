package com.example.demo.exh.service;

import com.example.demo.exh.domain.Exhbn;
import com.example.demo.exh.repository.ExhbnRepository;

import static java.util.Comparator.comparing;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service @RequiredArgsConstructor
public class ExhbnService {
	
	final ExhbnRepository exhbnRepository;

}
