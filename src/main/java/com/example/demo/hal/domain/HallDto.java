package com.example.demo.hal.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class HallDto {
	private int hallNum;
    private String hallName;
    private String hallNumber;
    private String hallLocation;
}
