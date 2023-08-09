package fr.eni.tp.filmotheque.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.eni.tp.filmotheque.bll.FilmService;
import fr.eni.tp.filmotheque.bo.Film;

@Controller
public class FilmController {

	// la couche IHM communique avec la couche BLL
	private FilmService filmService;

	// constructeur
	public FilmController(FilmService filmService) {
		this.filmService = filmService;
	}

	@GetMapping("/films/detail")
	public Object afficherUnFilm(@RequestParam("id") int id) {

		// interroger la couche BLL pour un seul film
		Film film = filmService.consulterFilmParId(id);

		// delegation de l'affichage à la vue
		return new ModelAndView("view-film-detail", "modelFilm", film);
	}

	@GetMapping("/films")
	public Object afficherFilms() {

		// interroger la couche BLL pour tous les films
		List<Film> films = filmService.consulterFilms();

		// delegation de l'affichage à la vue
		return new ModelAndView("view-films", "modelFilms", films);
	}

}
