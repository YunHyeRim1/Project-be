package com.example.demo.rec.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class RecommendDto {
	private int recNum;
	private int exhbnNum;
	private int userNum;
}
