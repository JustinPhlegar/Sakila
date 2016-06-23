package model.movies;

import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.movies.FilmDao;

public class FilmManager {

	public ArrayList getFilms() throws Exception {
		String sql = "SELECT film_id, title, description, release_year, language_id, original_language_id, "
				+ " rental_duration, rental_rate, length, replacement_cost, rating, special_features,last_update"
				+ " FROM sakila.film ORDER BY film_id ASC";
		ArrayList films = null;
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
