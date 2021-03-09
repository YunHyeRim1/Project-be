package com.example.demo.bkg.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class BookingDto {
	private long bookNum;
	private long exhbnNum;
	private long userNum;
	private String bookDate;
	private String totalPrice;
	private String bookName;
	private String bookEmail;
	private String bookPnumber;
}
