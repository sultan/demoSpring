// Copyright (c) 2023 the original author or authors. //

package fr.eni.demo.services;

import java.util.List;

import fr.eni.demo.entities.Personne;

public interface ContactService {

	public abstract void ajouterContact(Personne contact);

	public abstract void modifierContact(Personne contact);

	public abstract Personne rechercherContact(int id);

	public abstract List<Personne> listerContacts();

}
