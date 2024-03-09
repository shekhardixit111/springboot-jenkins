package com.sdixit.springboot.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootJenkinsApplication {

	public static Logger log= LoggerFactory.getLogger(SpringbootJenkinsApplication.class);
	@PostConstruct
	public init() {
		log.info("Application started...........");
		log.info("Application started logger added...........");
		log.info("Application started new logger added...........");
		
	}
	public static void main(String[] args) {
		log.info("Application executed...........");
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}

}
