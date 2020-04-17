package it.itsrizzoli.StoCamp;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyAccountController {
	
	
	@GetMapping("/settingsaccount")
	public String modificaprofilo(SettingsAccountForm settingsAccountForm) {
		return "settingsaccount";
	}
	
	/*@PostMapping("/settingsaccount")
	public String postModificaProfilo(@Valid SettingsAccountForm settingsAccountForm, BindingResult results) {
		if(results.hasErrors())
			return "settingsaccount";
		return "myaccount";
	}*/
}
