package com.sql.boot;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sql.boot.beans.SqlTutorial;
import com.sql.boot.repository.SqlRepository;
import com.sql.boot.service.SqlDao;

@Controller
public class HomeController {

//	@Autowired
//	private SqlDao dao;
//
//	@Autowired
//	private SqlRepository repo;
	
	
//	Send/Pass attributes from one controller to another using "forward/:url"
//	@GetMapping(path="/")
//	public String home(Model m, HttpServletRequest req) {
//		
//		List<SqlTutorial> list = this.dao.getAll();
//		
//		m.addAttribute("list", list);
//		req.setAttribute("value", list);
//		return "forward:/show";
//	}
//	
//	@GetMapping(path="/show")  //In case of forward "Get" work with "Get"
//	public String getControllerValue(Model m, HttpServletRequest req) {
//		List<SqlTutorial> list = (List<SqlTutorial>) req.getAttribute("value");
//		System.out.println(list.toString());
//		
//		return "experiment";
//	}
	
	
	
	
//	"RedirectAttributes attrib"==>addAttribute("","");===>need @ModelAttribute/@RequestParam to resolve value
//	@GetMapping(path="/")
//	public String home(Model m, RedirectAttributes attrib) {
//		
//		List<SqlTutorial> list = this.dao.getAll();
//		int i =15;
//		m.addAttribute("list", list);
//		attrib.addAttribute("value", i);
//		
//		return "redirect:/show";
//	}
//	
//	@GetMapping(path="/show")  
//	public String getControllerValue(@ModelAttribute("value") String values, Model m) {
//		System.out.println(Integer.parseInt(values));
////		Integer obj =(Integer) m.asMap().get("value");
//		
////		System.out.println(obj);
//		return "experiment";
//	}
	
	
	

//	"RedirectAttributes attrib"==>addFlashAttribute("","");===>Dont need @ModelAttribute They get direct value
//	@GetMapping(path="/")
//	public String home(Model m, RedirectAttributes attrib) {
//		
//		List<SqlTutorial> list = this.dao.getAll();
//		int i =15;
//		m.addAttribute("list", list);
////		attrib.addAttribute("value", "Expriment for contoller iteracting without Flush");
//		attrib.addFlashAttribute("flashValue", "jncndsfbbfjbjfbdrbu");
//		return "redirect:/show";
//	}
//	
//	@GetMapping(path="/show")   //But You can also use @ModelAttributes
//	public String getControllerValue(Model m) {
////		System.out.println(value);
//		String obj =(String) m.asMap().get("flashValue");
////		int obj = Integer.parseInt(value);
//		
//		System.out.println(obj);
//		return "experiment";
//	}

	// Pass Attributes/Paramenters Between Two Controller using "RedirectAttributes attrib" with flush======================================================
//	@GetMapping(path = "/")
//	public String home(Model m,RedirectAttributes attrib) {
//		List<SqlTutorial> list = this.dao.getAll();
//
//		m.addAttribute("list", list);
//		m.addAttribute("value", "Expriment for contoller iteracting");
//		attrib.addFlashAttribute("value", list);
//		return "redirect:/show";
//	}
//
//	@GetMapping(path = "/show") // Pass Attributes/Paramenters Between Two Controller
//	public String getControllerValue(Model m) {
////		Object object = m.getAttribute("value");
//		List<SqlTutorial> obj = (List<SqlTutorial>) m.asMap().get("value");
//		System.out.println(obj.toString());
//		return "experiment";
//	}

	
	//In case of forward "Get" work with "Get"==============================================================
//	@GetMapping(path="/")
//	public String home(Model m) {
////		SqlTutorial s = new SqlTutorial();
////		s.setName("Amit");
////		s.setCity("Ghatkopar");
////		s.setMobileNumber(5812036741l);
////		s.setRole("User");
////		
////		repo.save(s);
//		
//		List<SqlTutorial> list = this.dao.getAll();
//		
//		m.addAttribute("list", list);
//		m.addAttribute("value", "Expriment for contoller iteracting");
//		return "forward:/show";
//	}
//	
//	@GetMapping(path="/show")  //In case of forward "Get" work with "Get"
//	public String getControllerValue(Model m) {
//		Object object = m.getAttribute("value");
//		System.out.println(object);
//		return "experiment";
//	}

//	@PostMapping(path = "/view/search")
//	public String search(@RequestParam("query") String keyword, Model m) {
//		List<SqlTutorial> list = this.dao.searchResult(keyword);
//		System.out.println(list);
//		m.addAttribute("list", list);
//		return "result";
//
//	}

}
