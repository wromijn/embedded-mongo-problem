package com.bl0x.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties(MongoProperties.class)
@EnableScheduling
public class PersonApplication {
	public static void main(String[] args) {
		SpringApplication.run(PersonApplication.class, args);
	}
}