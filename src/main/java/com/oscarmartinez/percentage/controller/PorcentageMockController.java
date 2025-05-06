package com.oscarmartinez.percentage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mock")
public class PorcentageMockController {
	
	@GetMapping("/percentage")
    public double getPercentage() {
        return 10.0;
    }

}
