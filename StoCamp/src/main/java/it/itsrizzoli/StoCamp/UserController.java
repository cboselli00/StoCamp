package it.itsrizzoli.StoCamp;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@GetMapping("/login")
	public String login(LoginForm loginForm) {
		return "Login";
	}
	
	@PostMapping("/login")
	public String postLogin(@Valid LoginForm loginForm, BindingResult results) {
		if(results.hasErrors())
			return "Login";
		return "Home";
	}
	
	@GetMapping("/Registrazione")
	public String registrazione(RegistrazioneForm registrazioneForm) {
		return "Registrazione";
	}
	
	@PostMapping("/Registrazione")
	public String postRegistrazione(@Valid RegistrazioneForm registrazioneForm, BindingResult results) {
		if(results.hasErrors())
			return "Registrazione";
		return "Home";
	}
	
	@GetMapping("/Password_dimenticata")
	public String passwordDimenticata(Password_dimenticataForm password_dimenticataForm) {
		return "Password_dimenticata";
	}
	
	@PostMapping("/Password_dimenticata")
	public String postPassword(@Valid Password_dimenticataForm password_dimenticataForm, BindingResult results) {
		if(results.hasErrors())
			return "Password_dimenticata";
		return "redirect:/login";
	}
	
	
}
