package com.cqh.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class usercontrol {
	@RequestMapping(value="/test")
	public String name(Model model,String name){
		System.out.println("name值："+name);
		model.addAttribute("name", name);
		return "success";
		
	}
}
