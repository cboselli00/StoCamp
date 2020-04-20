package it.itsrizzoli.StoCamp;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/Notifiche")
	public String notifiche() {
		return "Notifiche";
	}
	
	@GetMapping("/Contattaci")
	public String contattaci(ContattaciForm contattaciForm) {
		return "Contattaci";
	}
	
	@GetMapping("/Prenotazione")
	public String prenotazione(PrenotazioneForm prenotazioneForm) {
		return "Prenotazione";
	}
	
	@GetMapping("/myaccount")
	public ModelAndView profilo(HttpSession session) {
		Utente u = (Utente)session.getAttribute("loggedUser");
		
		ModelAndView mav = new ModelAndView();

		if (u != null) {
			mav.setViewName("myaccount");
			mav.addObject("utente", u);
		}
		else {
			mav.setViewName("redirect:/login");			
		}
		return mav;
	}
}
