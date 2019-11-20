package co.grandcircus.Lab_24.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.Lab_24.dao.PersonDao;
import co.grandcircus.Lab_24.model.Person;


@Controller
public class HomeController {

	@Autowired
	PersonDao dao;
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index", "itemList", dao.searchAllProducts());
	}
	
	@RequestMapping("/register")
	public ModelAndView recordInfo() {
		return new ModelAndView("register");
	}
	
	@RequestMapping("/summary")
	public ModelAndView formDeets(Person p) {
		ModelAndView mv = new ModelAndView("summary");
		dao.addPeson(p.getFirstName(), p.getLastName(), p.getBirthday(), p.getEmail(), p.getPhoneNumber(), p.getPassword(), p.getBranch(), p.isNewsletter());
		mv.addObject("welcome","Hello " + p.getFirstName() + " " + p.getLastName() + "! Thank you for registering");
		mv.addObject("email", "Email: " + p.getEmail());
		mv.addObject("number", "Phone Number: " + p.getPhoneNumber());
		mv.addObject("branch", "We are looking forward to seeing you next time at our " + p.getBranch() + " branch!");
		if (p.isNewsletter()) {
			mv.addObject("newsletter", "Anticipate receiving our newsletter every day from now " + "<span style='font-size:400%' >" + "until the end of time! :)" + "</span");
		}
		return mv;
	}
}