package com.userlarsb.demo;

import java.util.Random; 

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SimpleController {

	@RequestMapping("/")
	public String index() {
		Random rnd = new Random();
		String version = System.getenv("COMMIT_ID");
		version = version != null ? version : "MISSING";
		int randInt = rnd.nextInt(100000);
		return "The application is running. " +
				"Commit ID is " + version + ". " +
				"Random output: " + randInt;
	}
}