package com.buddywindow.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buddywindow")
public class BuddywindowResources {
	
	Logger loggerFactory = LoggerFactory.getLogger(BuddywindowResources.class);
	@GetMapping("/message/{name}")
	public String getWelcomeMessage(@PathVariable String name) {
		if(name.equalsIgnoreCase("test")) {
			throw new RuntimeException("Sampel");
		}
		loggerFactory.debug("User name is {}", name);
		String response = "Hi "+name+", Welcome to buddywindow application";
		loggerFactory.debug("The response is {}", response);
		return response;
	}

}
