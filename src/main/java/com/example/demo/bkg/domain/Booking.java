package com.example.demo.bkg.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.exh.domain.Exhbn;
import com.example.demo.uss.domain.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;

@Entity @Getter
@Table(name = "bookings")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Booking {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_num") private long bookNum;
	@Column(name = "book_date") private String bookDate;
	@Column(name = "total_price") private String totalPrice;
	@Column(name = "book_name") private String bookName;
	@Column(name = "book_email") private String bookEmail;
	@Column(name = "book_pnumber") private String bookPnumber;
	
	@ManyToOne
    @JoinColumn(name = "exhbn_num")
    private Exhbn exhbn;
	
	@ManyToOne
    @JoinColumn(name = "user_num")
    private User user;
}
