package com.buddywindow.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buddywindow-app")
public class BuddywindowResource {
	
	@GetMapping("/welcome-msg")
	public String getWelcomeMessage() {
		return "Hi, Welcome to your application";
	}

}
