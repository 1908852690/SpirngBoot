package cn.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(Model model)
	{
		System.out.println("进入Controller");
		model.addAttribute("name","黑黑");
		return "index";
	}
}
