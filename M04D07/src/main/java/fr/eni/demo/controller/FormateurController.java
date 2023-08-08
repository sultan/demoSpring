package fr.eni.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.demo.bll.FormateurService;
import fr.eni.demo.bo.Formateur;

//@Controller --> permet de définir la classe comme un bean Spring de type Controller
@Controller
//Url par défaut pour toutes les méthodes du contrôleur
@RequestMapping("/formateurs")
public class FormateurController {
	// Injection du FormateurService
	private FormateurService formateurService;

	public FormateurController(FormateurService formateurService) {
		this.formateurService = formateurService;
	}

	@GetMapping
	public String afficherFormateurs(Model model) {
		List<Formateur> lstFormateurs = formateurService.getFormateurs();
		model.addAttribute("formateurs", lstFormateurs);
		return "view-formateurs";

	}

	@GetMapping("/detail")
	public String detailFormateurParParametre(
		@RequestParam(name = "email", required = false, 
	              defaultValue = "coach@campus-eni.fr") String emailFormateur, Model model) {
		System.out.println("Le paramètre - " + emailFormateur);
		Formateur formateur = formateurService.findByEmail(emailFormateur);
	// Ajout de l'instance dans le modèle
		model.addAttribute("formateur", formateur);
		return "view-formateur-detail";
	}

	@PostMapping("/detail")
	public String mettreAJourFormateur(@RequestParam(required = true) String email,
			@RequestParam(required = true) String nom, @RequestParam(required = true) String prenom) {
		System.out.println("Les paramètres");
		System.out.println("Email - " + email);
		System.out.println("Nom - " + nom);
		System.out.println("Prenom - " + prenom);
		//Redirection l’affichage de tous les formateurs, en appelant la méthode afficherFormateurs
		return "redirect:/formateurs";

	}
}
