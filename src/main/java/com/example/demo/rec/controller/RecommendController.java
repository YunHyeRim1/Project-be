package com.example.demo.rec.controller;

import static com.example.demo.cmm.domain.Util.string;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.domain.Messenger;
import com.example.demo.cmm.domain.Pagination;
import com.example.demo.exh.domain.Exhbn;
import com.example.demo.exh.repository.ExhbnRepository;
import com.example.demo.exh.service.ExhbnService;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
@RequestMapping("/recommends")
public class RecommendController {

}
