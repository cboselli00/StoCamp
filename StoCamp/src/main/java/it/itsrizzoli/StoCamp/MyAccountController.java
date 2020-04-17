package it.itsrizzoli.StoCamp;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class MyAccountController {
	
	@GetMapping("/Home")
	public String Home() {
		return "Home";
	}
	
	@GetMapping("/settingsaccount")
	public String contattaci(SettingsAccountForm settingsAccountForm) {
		return "settingsaccount";
	}
	
	@PostMapping("/settingsaccount")
	public String postLogin(@Valid SettingsAccountForm settingsAccountForm, BindingResult results) {
		if(results.hasErrors())
			return "settingsaccount";
		return "myaccount";
	}

}
