package it.itsrizzoli.StoCamp;

import org.springframework.web.bind.annotation.GetMapping;

public class MyAccountController {
	
	@GetMapping("/Home")
	public String Home() {
		return "Home";
	}

}
