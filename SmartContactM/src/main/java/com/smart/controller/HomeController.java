package com.smart.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.smart.dao.UserRepository;
import com.smart.entities.User;
import com.smart.helper.Message;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/")
	public String homeController(Model model) {
		
		model.addAttribute("title", "Home- Smart Contact Management");
		return "home";
	}
	
	@RequestMapping("/about")
	public String aboutController(Model model) {
		
		model.addAttribute("title", "About- Smart Contact Management");
		return "about";
	}
	
	@RequestMapping("/signup")
	public String signUpController(Model model) {
		
		model.addAttribute("title", "Register- Smart Contact Management");
		model.addAttribute("user", new User());
		return "signup";
	}
	
	//this handle for registering user
	@PostMapping("/do_register")
	public String registerUser(@Valid  @ModelAttribute("user") User user, BindingResult result1,
	                           @RequestParam(value="agreement", defaultValue = "false") Boolean agreement, 
	                           Model model, 
	                           HttpSession session, 
	                           RedirectAttributes redirectAttributes) {

	    try {
	        if(!agreement) {
	            System.out.println("you not checked agreement");
	            throw new Exception("you not checked agreement");
	            
	        }
	        
	        if(result1.hasErrors()) {
	        	
	        	System.out.println("ERROR "+result1.toString());
	        	model.addAttribute("user", user);
	        	return "signup";
	        }

	        user.setRole("ROLE_USER");
	        user.setEnabled(true);
	        user.setImageUrl("default.png");

	        User result = this.userRepository.save(user);

	        System.out.println("user "+user);

	        redirectAttributes.addFlashAttribute("message", new Message("Registration Successful !!", "alert-success"));
	        return "redirect:/signup";

	    } catch (Exception e) {
	        e.printStackTrace();
	        redirectAttributes.addFlashAttribute("user", user);
	        redirectAttributes.addFlashAttribute("message", new Message("Something went wrong !!"+e.getMessage(), "alert-danger"));
	        return "redirect:/signup";
	    }
	}

}
