package it.itsrizzoli.StoCamp;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import it.itsrizzoli.StoCamp.UtenteController;

@Controller
public class HomeController {
	
	@Autowired
	private PrenotaDao prenotaRepository;
	
	/*@Autowired
	private CampoDao campoRepository;*/
	
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
	
	@PostMapping("/Prenotazione")
	public String postPrenotazione(@Valid PrenotazioneForm prenotazioneForm,BindingResult results, Model model, HttpSession session) {
		if(results.hasErrors()){
            return "Prenotazione";
        }
		Utente u = (Utente)session.getAttribute("loggedUser");
		
		prenotazioneForm.setUtente(u);
		prenotazioneForm.setCampo();
		prenotaRepository.save(prenotazioneForm);
		
		return "redirect:/Home";
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
