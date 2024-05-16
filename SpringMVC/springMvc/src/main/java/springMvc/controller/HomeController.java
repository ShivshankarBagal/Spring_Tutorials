package springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Hello, This is Home URL");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		
		System.out.println("This is about Page");
		return"about";
	}
	

}
