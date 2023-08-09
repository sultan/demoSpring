package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

public class Film {

	private long id;
	private String titre;
	private int annee, duree;
	private String synopsis;

	// relations d'associations many-to-one
	private Genre genre;
	private Participant realisateur;

	// relations d'associations one-to-many
	private List<Avis> avis = new ArrayList<>();

	// relations d'associations many-to-many
	private List<Participant> acteurs = new ArrayList<>();

	// constructeurs

	public Film(long id, String titre, int annee, int duree, String synopsis) {
		super();
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
	}

	// méthodes

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Film [id=").append(id).append(", titre=").append(titre).append(", annee=").append(annee)
				.append(", duree=").append(duree).append(", synopsis=").append(synopsis).append(", genre=")
				.append(genre).append(", realisateur=").append(realisateur).append(", avis=").append(avis)
				.append(", acteurs=").append(acteurs).append("]");
		return builder.toString();
	}

	// getters/setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Participant getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Participant realisateur) {
		this.realisateur = realisateur;
	}

	public List<Avis> getAvis() {
		return avis;
	}

	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}

	public List<Participant> getActeurs() {
		return acteurs;
	}

	public void setActeurs(List<Participant> acteurs) {
		this.acteurs = acteurs;
	}

}
