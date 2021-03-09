package com.example.demo.exh.domain;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class ExhbnDto {
	private long exhbnNum;
	private long hallNum;
    private String exhbnTitle; 
    private String startDate; 
    private String endDate;
    private String exhbnGenre;
    private String exhbnPrice;
    private String exhbnArtist;
    private String exhbnContent;
    private String exhbnImage;
}
