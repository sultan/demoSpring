package fr.eni.demo.entities;

public class Personne {

	private String prenom, nom;

	public Personne() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personne [prenom=").append(prenom).append(", nom=").append(nom).append("]");
		return builder.toString();
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
