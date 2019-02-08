package com.acme.app.api;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/greetings")
class GreetingController {

	@GetMapping
	Object greet(@RequestParam(defaultValue = "world") String name) {
		Map<String, Object> data = Map.of("greeting", "Hello " + name, "time", System.currentTimeMillis());
		log.info("\nReturning: {}", data);
		return data;
	}
}
