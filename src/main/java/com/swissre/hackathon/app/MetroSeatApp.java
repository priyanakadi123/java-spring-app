package com.swissre.hackathon.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.swissre.hackathon.app")
public class MetroSeatApp {

	public static void main(String[] args) {
		SpringApplication.run(MetroSeatApp.class, args);
	}
}
