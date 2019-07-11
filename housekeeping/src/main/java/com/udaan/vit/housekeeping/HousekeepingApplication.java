package com.udaan.vit.housekeeping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication

public class HousekeepingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HousekeepingApplication.class, args);
	}

}
