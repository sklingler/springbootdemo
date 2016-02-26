package com.example;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	public String run(final String input) {
		return input + " from DemoService";
	}
}
