package com.everis.d4i.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Netflix2Main {
    
	public static void main(String[] args) {
		SpringApplication.run(Netflix2Main.class, args);
	}
	
}