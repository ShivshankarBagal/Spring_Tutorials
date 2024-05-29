package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcsearch.entities.Student;

@Controller
public class ComplexFormController {
	
	@RequestMapping("/form")
	public String showForm( ){
		
		return "complexForm";
	}
	@RequestMapping(path = "/submitForm", method=RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student, Model model) {
		
		System.out.println(student);
		return "success";
	}

}
