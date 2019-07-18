package com.juju.mongo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.juju.mongo.Service.UserService;
import com.juju.mongo.document.Users;
import com.juju.mongo.model.Login;

import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

	@Autowired
	UserService userSevice;

	@GetMapping("/login")
	public String loginForm(Model model) {
		System.out.println("The model object should be ready to store the form data");
		model.addAttribute("login", new Login());
		return "index";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute Login login, Model model) {
		String username = login.getUsername();
		String password = login.getPassword();
		if (null != username && null != password) {
			if ((username.equalsIgnoreCase("papu") && password.equalsIgnoreCase("papu"))
					|| username.equalsIgnoreCase("juju") && password.equalsIgnoreCase("juju")) {
				model.addAttribute("username", username);
				model.addAttribute("userList", userSevice.findAll());
				return "user";
			}
		} else
			return "index";
		return "index";
	}

}
