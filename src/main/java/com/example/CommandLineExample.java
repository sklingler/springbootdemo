package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class CommandLineExample implements CommandLineRunner {
	@Autowired DemoService demoService;

	private void runDemo() {
		System.out.println("running demo");
		System.out.println(demoService.run("Demonstration from command line - "));
	}
	   
//	@Override
	public void run(String... args) throws Exception {
		runDemo();
	}
}
