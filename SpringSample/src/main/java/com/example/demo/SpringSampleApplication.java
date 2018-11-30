package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSampleApplication {
	
    @RequestMapping("/")
    String hello() {
        return "HELLO SPLING";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringSampleApplication.class, args);
	}
}
