package model.movies;

import java.util.ArrayList;

import dao.movies.FilmDao;
import dto.movies.Film;

public class FilmModel {

	public ArrayList<Film> getFilms() throws Exception {
		String sql = "SELECT film_id, title, description, release_year, language_id, original_language_id, "
				+ " rental_duration, rental_rate, length, replacement_cost, rating, special_features,last_update"
				+ " FROM sakila.film ORDER BY film_id ASC";
		ArrayList<Film> films = null;
		try {
			// Here you can validate before connecting DAO class, eg. User session condition 
			FilmDao filmDao= new FilmDao();
			films=filmDao.getFilms( sql);
		} 
		catch (Exception e) {
			throw e;
		}
		return films;
	}

}
