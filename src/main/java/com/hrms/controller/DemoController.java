package com.hrms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.model.DemoModel;

@RestController
public class DemoController {
	@GetMapping("/home")
	public String Demo() {
		return "hii";
		
	}
	@PostMapping("/home")
	public DemoModel DemoModel(@RequestBody  DemoModel DemoModel) {
		System.out.println("id "+DemoModel.getId());
		return DemoModel;
		
	}
	
}
