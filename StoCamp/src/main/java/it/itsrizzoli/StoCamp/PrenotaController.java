package it.itsrizzoli.StoCamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class PrenotaController {
	
	@Controller
	public class HomeController {
		
		@GetMapping("/Home")
		public String Home(PrenotazioneForm prenotazioneForm) {
			return "redirect:/Home";
		}
	

	}


}
