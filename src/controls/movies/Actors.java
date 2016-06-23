package controls.movies;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import dto.movies.Actor;
import model.movies.ActorModel;


@Path("/movies")
public class Actors{
	@GET
	@Path("/actors")
	@Produces(MediaType.APPLICATION_JSON)
	public String getActors() throws Exception {
		ActorModel actorManager= new ActorModel();
		ArrayList<Actor> actorsData = null;
		actorsData = actorManager.getActors();
		Gson gson = new Gson();
		String messages = gson.toJson(actorsData);
		return ("{\"Actors\":"+messages+"}");		
	}
	
	@GET
	@Path("/actors/{actor_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getActor(@PathParam("actor_id") String actorId) throws Exception {
		ActorModel actorManager= new ActorModel();
		Actor actorData = null;
		actorData = actorManager.getActor(actorId);
		Gson gson = new Gson();
		String actor = gson.toJson(actorData);
		return actor;		
	}
}