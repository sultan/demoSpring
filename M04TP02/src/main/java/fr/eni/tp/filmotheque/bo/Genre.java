package fr.eni.tp.filmotheque.bo;

public class Genre {

	private long id;
	private String titre;

	public Genre(long id, String titre) {
		super();
		this.id = id;
		this.titre = titre;
	}

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

}
