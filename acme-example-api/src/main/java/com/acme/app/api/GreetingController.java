package com.acme.app.api;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
class GreetingController {

	@GetMapping
	Object greet(@RequestParam(defaultValue = "world") String name) {
		return Map.of("greeting", "Hello " + name, "time", System.currentTimeMillis());
	}
}
