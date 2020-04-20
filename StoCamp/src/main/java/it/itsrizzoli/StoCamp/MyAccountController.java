package it.itsrizzoli.StoCamp;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyAccountController {
	@Autowired
	private UtenteDao userRepository;
	@GetMapping("/settingsaccount")
	public String modificaprofilo(SettingsAccountForm settingsAccountForm) {
		
	/*	ModelAndView mav = new ModelAndView();
		
		if (u != null) {
			mav.setViewName("settingsccount");
			mav.addObject("utente", u);
		}
		else {
			mav.setViewName("redirect:/login");			
		}    */
		
		return "settingsaccount";
	}
	
	@PostMapping("/settingsaccount")
	public String postModificaProfilo(@Valid SettingsAccountForm settingsAccountForm,
			HttpSession session, @RequestParam("username") String username, 
			@RequestParam("eta") int eta, @RequestParam("citta_residenza") String cittaresidenza,
			@RequestParam("indirizzo") String indirizzo) {
		
		Utente u = (Utente)session.getAttribute("loggedUser");
		u.setUsername(username);
		u.setEta(eta);
		u.setCittaresidenza(cittaresidenza);
		u.setIndirizzo(indirizzo);
	userRepository.save(u);
	return "redirect:/myaccount";
	}
	
	@GetMapping("/impostazioni")
	public String impostazioni() {
		return "impostazioni";
	}
}
