package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.excelr.model.Laptops;
import com.excelr.repo.LaptopsRepo;

@Controller
public class WebController {

	@Autowired
	private LaptopsRepo repo;
	
	@GetMapping("/uploadLaptop")
	public String uploadLaptop() {
		return "formuploadLaptop";
	}
	
	@PostMapping("/saveWeb")
	public String saveWeb(Laptops laptop) {
		repo.save(laptop);
		return "success";
	}
	
	@GetMapping("/viewLaptops")
	public String viewLaptops(Model model) {
		model.addAttribute("laptops", repo.findAll());
		return "display";
	}
}