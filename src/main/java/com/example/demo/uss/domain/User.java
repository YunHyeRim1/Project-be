package com.example.demo.uss.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.anl.domain.Analysis;
import com.example.demo.bkg.domain.Booking;
import com.example.demo.rev.domain.Review;

import lombok.Getter;

@Entity @Getter
@Table(name = "users")
public class User {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_num") private int userNum;
	@Column(name = "userid") private String userid;
	@Column(name = "password") private String password;
	@Column(name = "username") private String username;
	@Column(name = "email") private String email;
	@Column(name = "gender") private String gender;
	@Column(name = "birthday") private String birthday;
	@Column(name = "phone_number") private String phoneNumber;
	@Column(name = "admin") private String admin;
	@Column(name = "prefer_genre") private String preferGenre;
	
	@OneToMany(mappedBy = "user")
    private List<Analysis> analysisList = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
    private List<Review> reviewList = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
    private List<Booking> bookingList = new ArrayList<>();
}
