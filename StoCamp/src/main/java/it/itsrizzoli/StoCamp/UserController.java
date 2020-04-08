package it.itsrizzoli.StoCamp;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@GetMapping("/login")
	public String login(LoginForm loginForm) {
		return "login";
	}
	
	@PostMapping("/login")
	public String postLogin(LoginForm loginForm, BindingResult results) {
		if(results.hasErrors())
			return "login";
		return "Home";
	}
	
	
}
