package fr.eni.tp.filmotheque.controller;

import java.util.List;

import org.springframework.stereotype.Component;

import fr.eni.tp.filmotheque.bll.FilmService;
import fr.eni.tp.filmotheque.bo.Film;

@Component
public class FilmController {

	// la couche IHM communique avec la couche BLL
	private FilmService filmService;

	// constructeur
	public FilmController(FilmService filmService) {
		this.filmService = filmService;
	}

	public void afficherUnFilm(int id) {

		// interroger la couche BLL pour un seul film
		Film film = filmService.consulterFilmParId(id);
		
		// delegation de l'affichage à la méthode println
		System.out.println(film);
	}

	public void afficherFilms() {

		// interroger la couche BLL pour tous les films
		List<Film> films = filmService.consulterFilms();
		
		// delegation de l'affichage à la méthode println
		for (Film film : films) {
			System.out.println(film);
		}
	}

}
