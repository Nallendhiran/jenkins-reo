package com.Springcloud;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class SpringbootJenkinsApplication {
	@PostConstruct
	public void get() {
		Logger log=LoggerFactory.getLogger(SpringbootJenkinsApplication.class);
		log.info("--------------------------initialized with some message without test------------------------------------------------");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}

}
