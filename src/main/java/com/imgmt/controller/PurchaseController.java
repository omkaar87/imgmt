package com.imgmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("purchase")
public class PurchaseController {

	@GetMapping
	public String purchase() {
		return "purchase";
	}
	
}
