// Copyright (c) 2023 the original author or authors. //

package fr.eni.demo.entities;

public class Personne {

	private int id;
	private String prenom, nom;

	public Personne() {
		super();
	}

	public Personne(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personne [id=").append(id).append(", prenom=").append(prenom).append(", nom=").append(nom)
				.append("]");
		return builder.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
