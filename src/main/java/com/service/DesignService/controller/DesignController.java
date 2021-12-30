package com.service.DesignService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.DesignService.service.DesignService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DesignController {

	@GetMapping("/username")
	public String userName() {
		String name = DesignService.getName();
		log.info("user name is {}", name);
		return name;
	}
	
}
