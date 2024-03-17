package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.controller.dao.Modeldao;
import com.model.Gripinfo;

@Controller
public class Democontroller {
	
	@Autowired
	private Modeldao dao;
	
	
		@RequestMapping("/")
		public String home() {
			return"index";
		}
		
		@RequestMapping("addgrip")
		public String addAlien(@ModelAttribute("add") Gripinfo g) {
			
			dao.addAlien(g);
			return "result";
		}
		@RequestMapping("findgrip")
		public String findgrip(@RequestParam("idGripinfo") int i, Model m) {
			m.addAttribute("find", dao.findgrip(i));
			return"result";
		}
		
}

