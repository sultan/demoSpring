// Copyright (c) 2023 the original author or authors. //

package fr.eni.demo.controllers;

import java.util.Objects;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.demo.entities.Personne;
import fr.eni.demo.services.ContactService;

@Controller
public class ContactController {

	private ContactService contactService;

	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}

	@GetMapping("/")
	public Object index(Model model) {
		Personne p = new Personne();
		model.addAttribute("modelContact", p);
		return "view-contact-edit-form";
	}

	@GetMapping("/contact/edit")
	public Object index(@RequestParam("id") int id, Model model) {
		System.out.println(id);
		Personne p = contactService.rechercherContact(id);
		System.out.println(p);
		model.addAttribute("modelContact", p);
		return "view-contact-edit-form";
	}

	@GetMapping("/contact")
	public Object list(Model model) {
		var contacts = contactService.listerContacts();
		model.addAttribute("modelListeContacts", contacts);
		return "view-contacts";
	}

	@PostMapping("/contact/save")
	public Object save(Personne p) {
		System.out.println(p);

		if (Objects.isNull(p.getId()) || Objects.equals(p.getId(), 0)) {
			contactService.ajouterContact(p);
		} else {
			contactService.modifierContact(p);
		}

		return "redirect:/contact";

	}

}
