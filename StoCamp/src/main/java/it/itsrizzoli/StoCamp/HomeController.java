package it.itsrizzoli.StoCamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/Notifiche")
	public String notifiche() {
		return "Notifiche";
	}
	
	@GetMapping("/Contattaci")
	public String contattaci() {
		return "Contattaci";
	}
	
	@GetMapping("/Prenotazione")
	public String prenotazione() {
		return "Prenotazione";
	}
	
	@GetMapping("/myaccount")
	public String profilo() {
		return "myaccount";
	}

}