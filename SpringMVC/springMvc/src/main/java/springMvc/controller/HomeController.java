package springMvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Hello, This is Home URL");

		model.addAttribute("name", "Amit Tate");
		model.addAttribute("id", 7);
		List<String> partners = new ArrayList<String>();
		partners.add("Nayan");
		partners.add("Maya");
		partners.add("Devki");

		model.addAttribute("part", partners);

		return "index";// "index" is .jsp page name
	}

	@RequestMapping("/about")
	public String about() {

		System.out.println("This is about Page");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help Controller");
		ModelAndView mAndV = new ModelAndView();

		// setting data
		mAndV.addObject("name", "Gauri Chillarge");
		mAndV.addObject("id", 07);

		LocalDateTime now = LocalDateTime.now();
		mAndV.addObject("time", now);

		// setting view name
		mAndV.setViewName("help");

		return mAndV;
	}

	@RequestMapping("/shiva")
	public ModelAndView shiv() {

		System.out.println("This is using JSP Expression " + "language to pring values in psring mvc");
		ModelAndView mAndV = new ModelAndView();

		mAndV.addObject("msg", "This is using JSP Expression" + " language to pring values in psring mvc");

		// setting data
		mAndV.addObject("name", "Ashu Chillarge");
		mAndV.addObject("id", 07);

		LocalDateTime now = LocalDateTime.now();
		mAndV.addObject("time", now);

		List<Integer> marks = new ArrayList<Integer>();
		marks.add(77);
		marks.add(95);
		marks.add(56);
		marks.add(94);
		marks.add(99);

		mAndV.addObject("result", marks);

		// setting view name
		mAndV.setViewName("shiva");

		return mAndV;

	}

}
