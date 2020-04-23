package it.itsrizzoli.StoCamp;

import java.sql.Date;
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
import org.springframework.web.servlet.ModelAndView;
import it.itsrizzoli.StoCamp.UtenteController;

@Controller
public class HomeController {
	
	@Autowired
	private SquadraDao squadraRepository;

	@Autowired
	private PrenotaDao prenotaRepository;
	
	@Autowired
	private CampoDao campoRepository;
	
	@Autowired
    CampoJdbcDao campoJdbcRepository;
	
	@Autowired
	PrenotaJdbcDao JdbcRepository;
	
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
	List<Campo> listaCampi = campoJdbcRepository.listaCampi();
	Campo c1 = listaCampi.get(0);
	Campo c2 = listaCampi.get(1);
	Campo c3 = listaCampi.get(2);
	Campo c4 = listaCampi.get(3);
	Campo c5 = listaCampi.get(4);
		
		ModelAndView mav = new ModelAndView();

		if (u != null) {
			mav.setViewName("Prenotazione");
			mav.addObject("campo1", c1);
			mav.addObject("campo2", c2);
			mav.addObject("campo3", c3);
			mav.addObject("campo4", c4);
			mav.addObject("campo5", c5);
			
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
		String nomecampo = prenotazioneForm.nomecampo;
		Date data = prenotazioneForm.data;
		double orainizio = prenotazioneForm.orainizio;
		double orafine = prenotazioneForm.orafine;
		
		
		prenotazioneForm.setPartecipante(u);
		prenotazioneForm.setNomecampo(nomecampo);
		prenotazioneForm.setData(data);
		prenotazioneForm.setOrainizio(orainizio);
		prenotazioneForm.setOrafine(orafine);
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
	
	@GetMapping("/CreaSquadra")
	public ModelAndView creasquadra(HttpSession session, CreaSquadraForm creaSquadraForm) {
		Utente u = (Utente)session.getAttribute("loggedUser");
		
		ModelAndView mav = new ModelAndView();

		if (u != null) {
			mav.setViewName("CreaSquadra");
		}
		else {
			mav.setViewName("redirect:/login");			
		}
		return mav;
	}
	
	@PostMapping("/CreaSquadra")
	public String creazionesquadra(@Valid CreaSquadraForm creaSquadraForm, BindingResult results) {
		if(results.hasErrors()) {
			return "CreaSquadra";
		}
		String nome = creaSquadraForm.nome;
		String partecipante1=creaSquadraForm.partecipante1;
		String partecipante2=creaSquadraForm.partecipante2;
		String partecipante3=creaSquadraForm.partecipante3;
		String partecipante4=creaSquadraForm.partecipante4;
		
		creaSquadraForm.setNome(nome);
		creaSquadraForm.setPartecipante1(partecipante1);
		creaSquadraForm.setPartecipante2(partecipante2);
		creaSquadraForm.setPartecipante3(partecipante3);
		creaSquadraForm.setPartecipante4(partecipante4);
		squadraRepository.save(creaSquadraForm);
		
		return "redirect:/Home";
	}
	
	
	@GetMapping("/Home")
	public ModelAndView homepage(HttpSession session) {
		Utente u = (Utente)session.getAttribute("loggedUser");
		List<PrenotazioneForm> listaPrenotazioni = JdbcRepository.listaPrenotazioni();
		PrenotazioneForm pf1 = listaPrenotazioni.get(0);
		PrenotazioneForm pf2 = listaPrenotazioni.get(1);
		PrenotazioneForm pf3 = listaPrenotazioni.get(2);
		PrenotazioneForm pf4 = listaPrenotazioni.get(3);
		ModelAndView mav = new ModelAndView();

		if (u != null) {
			mav.setViewName("Home");
			mav.addObject("prenotazione1", pf1);
			mav.addObject("prenotazione2", pf2);
			mav.addObject("prenotazione3", pf3);
			mav.addObject("prenotazione4", pf4);
		}
		else {
			mav.setViewName("redirect:/login");			
		}
		return mav;
	}
	
	 
		
}
