// Copyright (c) 2023 the original author or authors. //

package fr.eni.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.eni.demo.entities.Personne;

@Controller
public class ContactController {

	private ContactService contactService;

	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}

	@GetMapping("/")
	public Object index() {
		return "form";
	}

	@PostMapping("/contact/save")
	public Object save(Personne contact) {
		System.out.println(contact.toString());
		System.out.println("traitement");

		// ajout de la personne saisie aux contacts
		contactService.ajouterContact(contact);

		// récupération de tous les contacts
		List<Personne> contacts = contactService.listerContacts();

		return new ModelAndView("view-contacts", "modelListeContacts", contacts)
		// .addObject("modelMessage", "Bienvenu " + contact.getPrenom())
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
