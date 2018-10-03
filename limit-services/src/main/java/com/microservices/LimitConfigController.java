package com.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigController {
	@Autowired
	Configuration config;
    @GetMapping(value="limit")
	public LimitConfigBean getConfigValues() {
		return new LimitConfigBean(config.getMin(),config.getMax());
	}
}
