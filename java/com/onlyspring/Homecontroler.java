package com.onlyspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.onlyspring.dao.Reddydao;
import com.spring.model.Alien;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Homecontroler {
	
	
	@Autowired
	private Reddydao dao;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	/*@RequestMapping("add")
	public String add(HttpServletRequest req) {
		int n = Integer.parseInt(req.getParameter("num1"));
		int m = Integer.parseInt(req.getParameter("num2"));
		int sum = n+m;
		
		HttpSession session = req.getSession();
		session.setAttribute("sum", sum);
		return "result.jsp";
	}*/
	
	/*@RequestMapping("add")
		public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		int sum = i+j;
		mv.addObject("sum",sum);
		return mv;
		
	}*/
	@ModelAttribute
	public void addName(Model m) {
		m.addAttribute("name","Priyanshu");
	}
	

	/*@RequestMapping("add")
	public String add(@RequestParam("num1") int i,@RequestParam("num2") int j ,Model m) {
		int sum = i+j;
		m.addAttribute("sum",sum);
		return "result";
	}
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute("geeek") Alien a) {
		
		
		
		return "result";
	}*/
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute("geeek") Alien a) {
		
		dao.addAlien(a);
		
		return "showaliens";
	}
	
	@GetMapping("getAlien")
	public String getAlien(Model m) {
		
		
		m.addAttribute("result",dao.getAlien());
		
		
		return "showaliens";
	}
	@RequestMapping("getoneAlien")
	public String getoneAlien(@RequestParam("aid") int i, Model m) {
		
		
		m.addAttribute("result",dao.getoneAlien(i));
		return"showaliens";
	}
	
	public String oneAlien(@RequestParam("aid") int i, @RequestParam("aname") String j,Model m) {
		return"showaliens";
	}

}
