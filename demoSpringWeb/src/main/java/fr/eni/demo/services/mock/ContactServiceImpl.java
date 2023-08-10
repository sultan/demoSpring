// Copyright (c) 2023 the original author or authors. //

package fr.eni.demo.services.mock;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.eni.demo.entities.Personne;
import fr.eni.demo.repositories.ContactDao;
import fr.eni.demo.services.ContactService;

@Service
@Profile("default")
public class ContactServiceImpl implements ContactService {

	private ContactDao contactDao;

	public ContactServiceImpl(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	@Override
	public void ajouterContact(Personne contact) {
		contactDao.insert(contact);
	}

	@Override
	public void modifierContact(Personne contact) {
		contactDao.update(contact);
	}

	@Override
	public Personne rechercherContact(int id) {
		return contactDao.selectById(id);
	}

	@Override
	public List<Personne> listerContacts() {
		return contactDao.selectAll();
	}

}
