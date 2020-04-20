package it.itsrizzoli.StoCamp;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/Notifiche")
	public ModelAndView notifiche(HttpSession session) {
		Utente u = (Utente)session.getAttribute("loggedUser");
		
		ModelAndView mav = new ModelAndView();

		if (u != null) {
			mav.setViewName("Notifiche");
		}
		else {
			mav.setViewName("redirect:/login");			
		}
		return mav;
	}
	
	@GetMapping("/Contattaci")
	public ModelAndView contattaci(ContattaciForm contattaciForm,HttpSession session) {
		Utente u = (Utente)session.getAttribute("loggedUser");
		
		ModelAndView mav = new ModelAndView();

		if (u != null) {
			mav.setViewName("Contattaci");
		}
		else {
			mav.setViewName("redirect:/login");			
		}
		return mav;
	}
	
	@GetMapping("/Prenotazione")
	public ModelAndView prenotazione(PrenotazioneForm prenotazioneForm,HttpSession session) {
	Utente u = (Utente)session.getAttribute("loggedUser");
		
		ModelAndView mav = new ModelAndView();

		if (u != null) {
			mav.setViewName("Prenotazione");
		}
		else {
			mav.setViewName("redirect:/login");			
		}
		return mav;
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
