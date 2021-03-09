package com.example.demo.anl.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.demo.bkg.domain.BookingDto;

import lombok.Data;

@Data @Component @Lazy
public class AnalysisDto {
	private long analysis_num;
	private long exhbn_num;
	private long user_num;
}
