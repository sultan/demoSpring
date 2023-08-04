// Copyright (c) 2023 the original author or authors. //

package fr.eni.demo.services.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.demo.entities.Personne;
import fr.eni.demo.services.ContactService;

@Service
public class ContactServiceBouchon implements ContactService {

	private static List<Personne> contacts = new ArrayList<>( //
			List.of(new Personne("Alice", "Durand"), //
			new Personne("Bob", "Martin")));

	@Override
	public void ajouterContact(Personne contact) {
		contacts.add(contact);
	}

	@Override
	public List<Personne> listerContacts() {
		return contacts;
	}

}
