package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.model.Laptops;
import com.excelr.repo.LaptopsRepo;

@RestController
@CrossOrigin("*")
public class LaptopsController {
	
	@Autowired
	private LaptopsRepo repo;

	@PostMapping("/save")
	public Laptops createLaptop(@RequestBody Laptops laptops) {
		return repo.save(laptops);
	}
	@GetMapping("/viewall")
	public List<Laptops> viewLaptops() {
		return repo.findAll();
	}
}
