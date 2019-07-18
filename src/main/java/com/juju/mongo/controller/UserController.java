package com.juju.mongo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.juju.mongo.Service.UserService;
import com.juju.mongo.document.Users;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@Value("${welcome.message}")
	private String message;

	@GetMapping("/hello")
	public String showWelcome(Model model) {
		model.addAttribute("name", message);
		return "index";
	}

	@GetMapping("/usernewlist")
	public String getAllUserss(Model model) {
		model.addAttribute("userList", userService.findAll());
		return "user";
	}	
	
	/*@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){    
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/index";
	}*/

	
	

}
