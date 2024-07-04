package com.test.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.test.entities.LoginData;

@Controller
public class MyController {

	@GetMapping("/form")
	public String openForm(Model model) {
		System.out.println("Form started");
		model.addAttribute("loginData", new LoginData());
		return "formView";
		
	}
	//handler for processing form
	
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println(result);
			return "formView";
		}
		System.out.println(loginData);
		return "success";
	}
}
