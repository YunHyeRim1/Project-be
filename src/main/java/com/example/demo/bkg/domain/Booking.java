package com.example.demo.bkg.domain;

import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component @Getter @Setter @ToString @Entity
@AllArgsConstructor @Lazy @NoArgsConstructor
public class Booking {
	private int bookNum, exhbnNum, userNum;
	private String bookDate, totalPrice, bookName, bookEmail, bookPnumber;
}
