package model.movies;

import java.util.ArrayList;

import dao.movies.FilmActorDao;
import dto.movies.FilmActor;

public class FilmActorModel {

	public ArrayList<FilmActor> getFilmActors() throws Exception {
		String sql = "SELECT actor_id, film_id, last_update FROM sakila.film_actor ORDER BY actor_id ASC";
		ArrayList<FilmActor> messages = null;
		try {
			// Here you can validate before connecting DAO class, eg. User session condition 
			FilmActorDao filmActorDao= new FilmActorDao();
			messages=filmActorDao.getActors( sql);
		} 
		catch (Exception e) {
			throw e;
		}
		return messages;
	}

}
