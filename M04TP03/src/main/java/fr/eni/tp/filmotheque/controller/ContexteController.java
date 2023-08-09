package fr.eni.tp.filmotheque.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import fr.eni.tp.filmotheque.bll.ContexteService;
import fr.eni.tp.filmotheque.bo.Membre;
import jakarta.servlet.http.HttpSession;

@Controller
public class ContexteController {

	private ContexteService contexteService;

	public ContexteController(ContexteService contexteService) {
		this.contexteService = contexteService;
	}

	@GetMapping("contextes")
	public String contextes(HttpSession session) {
		System.out.println("contextes");
		List<Membre> users = contexteService.charger();
		session.setAttribute("usersSession", users);
		return "view-contexte";
	}

	@GetMapping("login")
	public String login(@RequestParam(defaultValue = "jtrillard@campus-eni.fr") String email, //
			HttpSession session) {
		System.out.println("login");
		Membre user = contexteService.charger(email);
		session.setAttribute("userSession", user);
		return "redirect:/films";
	}

	@GetMapping("logout")
	public String logout(SessionStatus status, HttpSession session) {
		// status.setComplete(); // framework spring
		session.invalidate(); // serveur web tomcat
		System.out.println("logout");
		return "redirect:/films";
	}

}
