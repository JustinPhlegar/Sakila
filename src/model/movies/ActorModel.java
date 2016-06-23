package model.movies;

import java.util.ArrayList;

import dao.movies.ActorDao;
import dto.movies.Actor;

public class ActorModel {

	public ArrayList<Actor> getActors() throws Exception {
		String sql = "SELECT actor_Id,first_name, last_name, last_update FROM sakila.actor ORDER BY actor_id ASC";
		ArrayList<Actor> messages = null;
		try {
			// Here you can validate before connecting DAO class, eg. User session condition 
			ActorDao actorDao= new ActorDao();
			messages=actorDao.getActors( sql);
		} 
		catch (Exception e) {
			throw e;
		}
		return messages;
	}
	

	public Actor getActor(String actor_id) throws Exception {
		
		String sql = "SELECT actor_Id,first_name, last_name, last_update FROM sakila.actor WHERE actor_id = " +  actor_id + " ORDER BY actor_id ASC";
		Actor messages = null;
		try {
			// Here you can validate before connecting DAO class, eg. User session condition 
			ActorDao actorDao= new ActorDao();
			messages=actorDao.getActor(sql);
		} 
		catch (Exception e) {
			throw e;
		}
		return messages;
	}

}
