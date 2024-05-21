package springMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMvc.model.User;
import springMvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired(required = true)
	private UserService userService;
	
	@ModelAttribute
	public void commanData(Model model) {
		model.addAttribute("Header", "Registration form");
		
		
	}

	@RequestMapping("/contact")
	public String showForm(Model model) {
		
		model.addAttribute("desc", "Fill all necessary fields *");

		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
		this.userService.createUser(user);

		// model.addAttribute("user", user);

		return "succes";
	}

}

/*
   @RequestMapping(path = "/processform", method = RequestMethod.POST) public
   String handleForm(@RequestParam("userEmail") String email,
   
   @RequestParam("userName") String name,
  
  @RequestParam("userPassword") String password, Model model) {
  
   System.out.println(email); System.out.println(name);
  System.out.println(password);
   
 
  
  
   User user = new User(); user.setuserEmail(email); user.setuserName(name);
   user.setuserPassword(password);
 
   //System.out.println(user);
   
   // process means if we want store data in DataBase // write this code here
  
   //model.addAttribute("userName", name);
   
   model.addAttribute("user", user);
   
  return "succes"; }
 */
