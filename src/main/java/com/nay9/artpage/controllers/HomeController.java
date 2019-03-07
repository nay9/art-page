package com.nay9.artpage.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nay9.artpage.repositories.ArtRepository;


@Controller
public class HomeController {
	
	
	@Resource
	ArtRepository artRepo;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("art", artRepo.findAll());
		return "home";
	}
	
	@GetMapping("/")
	public String artList(Model model) {
		model.addAttribute("art", artRepo.findAll());
		return "home";
	}

}