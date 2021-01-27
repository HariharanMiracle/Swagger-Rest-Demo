package com.swagger.src.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

	@GetMapping("method1")
	public String method1() {
		return "Method 1";
	}
	
}

// http://localhost:8082/swagger-ui.html
// http://localhost:8082/v2/api-docs