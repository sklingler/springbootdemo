package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

@Component
public class CommandLineExample implements CommandLineRunner {
	@Autowired DemoService demoService;

	private void runDemo() {
		System.out.println("running demo");
		System.out.println(demoService.run("Demonstration from command line - "));
	}
	   
	public void run(String... args) throws Exception {
		runDemo();
	}
}
