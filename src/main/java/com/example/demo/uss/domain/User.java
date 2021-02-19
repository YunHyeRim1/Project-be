package com.example.demo.uss.domain;

import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component @Getter @Setter @ToString @Entity
@AllArgsConstructor @Lazy @NoArgsConstructor
public class User {
	private int userNum;
	private String userid, password, username, email, gender, birthday, phoneNumber, admin;
}
