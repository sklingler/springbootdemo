package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * 2 choices. This main can implement CommandLine runner and use the demo service,
 * or we can rely on the CommandLinExample class to get picked up. That's what I chose.
 */
@SpringBootApplication
public class DemoApplication /* implements CommandLineRunner */ {

	@Autowired
	DemoService demoService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// This one seems to fire if we implement CommandLineRunner here
	public void run(String... args) throws Exception {
		System.out.println("entered DemoApplication.run()");
		System.out.println(demoService.run("Demonstration from command line FROM MAIN - "));
	}
}
