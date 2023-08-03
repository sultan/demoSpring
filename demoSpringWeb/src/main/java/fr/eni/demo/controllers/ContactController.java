package fr.eni.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.eni.demo.entities.Personne;

@Controller
public class ContactController {

	@PostMapping("/contact/save")
	public Object save(Personne contact) {
		System.out.println(contact.toString());
		System.out.println("traitement");
		return new ModelAndView("view-contacts", "modelContact", contact)
				.addObject("modelMessage", "Bienvenu " + contact.getPrenom())
		// .addObject("modelContact", contact)
		;
	}

	/*
	@PostMapping("/contact/save")
	public String save(Personne contact, Model model) {
		System.out.println(contact.toString());
		System.out.println("traitement");
		model.addAttribute("modelMessage", "Bienvenue " + contact.getPrenom());
		model.addAttribute("contact", contact);
		return "view-contacts";
	}
	*/

}
