package it.itsrizzoli.StoCamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SettingsAccountController {
	
	@GetMapping("/Home")
	public String FromProfileToHome(SettingsAccountForm settingsAccountForm) {
		return "Home";
	}

}
