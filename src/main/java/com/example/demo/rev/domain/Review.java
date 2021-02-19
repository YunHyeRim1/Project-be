package com.example.demo.rev.domain;

import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Component @Getter @Setter @ToString @Entity
@AllArgsConstructor @Lazy @NoArgsConstructor
public class Review {
	private int reviewNum, exhbnNum, userNum;
	private String reviewTitle, reviewContent, regDate, score;
}
/*
create table boards(
   board_num int primary key auto_increment,
   title varchar(30),
   content varchar(300),
   date varchar(20),
   id varchar(20)
   );*/