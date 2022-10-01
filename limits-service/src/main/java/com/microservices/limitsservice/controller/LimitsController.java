package com.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsservice.configuration.Configuration;
import com.microservices.limitsservice.entity.Limits;

@RestController
public class LimitsController {

	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public Limits listLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}
}
