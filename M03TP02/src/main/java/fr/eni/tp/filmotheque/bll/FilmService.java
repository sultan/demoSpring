package fr.eni.tp.filmotheque.bll;

import java.util.List;

import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.bo.Genre;
import fr.eni.tp.filmotheque.bo.Participant;

public interface FilmService {

	/**
	 * Cette méthode permet de simuler le stockage en base de données et la remontée
	 * d'information
	 */
	void simulationCoucheDALetDB();

	void creerFilm(Film film);

	/**
	 * @return participant si id correspond
	 * @return null si inconnu
	 */
	Participant consulterParticipantParId(long id);

	Genre consulterGenreParId(long id);

	List<Participant> consulterParticipants();

	List<Genre> consulterGenres();

	/**
	 * @return film si id correspond
	 * @return null si inconnu
	 */
	Film consulterFilmParId(long id);

	List<Film> consulterFilms();

}
