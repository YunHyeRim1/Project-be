package com.example.demo.rev.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class ReviewDto {
	private long reviewNum;
	private long exhbnNum;
	private long userNum;
	private String reviewTitle;
	private String reviewContent;
	private String regDate;
	private String score;
}
