// Copyright (c) 2023 the original author or authors. //

package fr.eni.demo.services.mock;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.demo.entities.Personne;
import fr.eni.demo.repositories.ContactDao;
import fr.eni.demo.services.ContactService;

@Service
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
	public List<Personne> listerContacts() {
		return contactDao.selectAll();
	}

}