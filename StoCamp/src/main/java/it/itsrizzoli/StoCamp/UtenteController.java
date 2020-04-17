package it.itsrizzoli.StoCamp;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UtenteController {
	@Autowired
	private UtenteDao userRepository;
	
	@Autowired
    UtenteJdbcDao userJdbcRepository;
	
	@GetMapping("/login")
	public String login(LoginForm loginForm) {
		return "Login";
	}
	
	@PostMapping("/login")
	public String postLogin(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session) {
		List<Utente> listaUtenti = userJdbcRepository.login(username, password);
		
		if(listaUtenti.size() == 0)
			
			return "redirect:/login";
		else {
			session.setAttribute("loggedUser", listaUtenti.get(0));

	        return "redirect:/Home";
		}
	}
	
	@GetMapping("/Registrazione")
	public String registrazione(RegistrazioneForm registrazioneForm) {
		return "Registrazione";
	}
	
	@PostMapping("/Registrazione")
	public String postRegistrazione(@Valid RegistrazioneForm registrazioneForm, @Valid Utente utente, BindingResult results, Model model, HttpSession session) {
		if(results.hasErrors()){
            return "Registrazione";
        }

		userRepository.save(utente);
		session.setAttribute("loggedUser", utente);


		model.addAttribute("msg", "Informazioni salvate");
        return "redirect:/Login";
	}
	
	@GetMapping("/Password_dimenticata")
	public String passwordDimenticata(Password_dimenticataForm password_dimenticataForm) {
		return "Password_dimenticata";
	}
	
	@PostMapping("/Password_dimenticata")
	public String postPassword(@Valid Password_dimenticataForm password_dimenticataForm, BindingResult results) {
		if(results.hasErrors())
			return "Password_dimenticata";
		return "redirect:/login";
	}
	
	
}