package com.sql.boot;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sql.boot.beans.SqlTutorial;
import com.sql.boot.service.SqlDao;

@Controller
public class MainController {
	
	@Autowired
	private SqlDao dao;
	
	@GetMapping(path="/")
	public String home(Model m, HttpSession session) {
		String msg = (String) m.asMap().get("message");
		System.out.println(msg);
		m.addAttribute("message", msg);
		
		return "experiment";
	}
	
	@PostMapping(path="/register")
	public String Register(@ModelAttribute SqlTutorial sql, HttpServletRequest req) {
		String code = dao.getRandom();
		System.out.println(code);
		LocalDate now = LocalDate.now();
		sql.setDate(now);
		req.setAttribute("data", sql);
		req.setAttribute("verifyCode", code);
	
		return "forward:/code";
	}
	
	@PostMapping(path="/code")
	public String verify(HttpServletRequest req, HttpSession session) {
		SqlTutorial sql2=(SqlTutorial) req.getAttribute("data");
		String code2=(String) req.getAttribute("verifyCode");
//		System.out.println(sql2+" : "+code2);
		session.setAttribute("mydata", sql2);
		session.setAttribute("mycode", code2);
		
		
		return "verify";
	}
	
	@PostMapping(path="/verify-code")
	public String submitCode(@RequestParam("code") String code, HttpSession session, RedirectAttributes attr, Model m) {
		String code2=(String) session.getAttribute("mycode");
		if(code.equals(code2)) {
			String msg = "Successfully register !!";
			attr.addFlashAttribute("message", msg);
			SqlTutorial sql3=(SqlTutorial) session.getAttribute("mydata");
//			dao.saveData(sql3);
			
			session.removeAttribute("mydata");
			session.removeAttribute("mycode");
			return "redirect:/";
			
		}else {
			
			String msg = "wrong code !!";
			m.addAttribute("msg", msg);
			return "verify";
			
		}
		
		
	}


}
