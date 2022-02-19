package com.springmvc;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.AllService;

@Controller
public class HomeController {
	
	@RequestMapping(path="/add", method=RequestMethod.GET)    // you can also use("/add")
	public String home(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m){
		AllService as = new AllService();
		System.out.println(i+" :"+j);
		int k=as.add(i, j);
		m.addAttribute("result", k);
		m.addAttribute("msg", "Your ans right");
		return "Display.jsp";
	}
	
//	@RequestMapping("/display")
//	public String display() {
//		return "Display.jsp";
//	}
	

}
