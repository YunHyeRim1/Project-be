package com.example.demo.anl.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.demo.bkg.domain.BookingDto;

import lombok.Data;

@Data @Component @Lazy
public class AnalysisDto {
	private int analysis_num;
	private int exhbn_num;
	private int user_num;
}
