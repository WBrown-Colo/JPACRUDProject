package com.skilldistillery.sports.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.sports.data.ColoSportsDAO;

@Controller
public class ColoSportsController {
	
	@Autowired
	private ColoSportsDAO teamDAO;
	
	@RequestMapping(path= {"/", "home.do"})
	public String home(Model model) {
		model.addAttribute("teamList", teamDAO.findAll());
		return "home";
	}

}
