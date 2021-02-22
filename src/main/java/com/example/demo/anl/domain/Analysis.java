package com.example.demo.anl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.demo.exh.domain.Exhbn;
import com.example.demo.rec.domain.Recommend;
import com.example.demo.uss.domain.User;

@Entity
public class Analysis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "anal_num") private int analNum;
	
	@ManyToOne
    @JoinColumn(name = "exhbn_num")
    private Exhbn exhbn;
	
	@ManyToOne
    @JoinColumn(name = "user_num")
    private User user;
	
	@OneToMany(mappedBy = "analysis")
    private List<Recommend> recommendList = new ArrayList<>();
}
