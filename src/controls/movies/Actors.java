package controls.movies;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import dao.Database;
import dto.movies.Actor;
import model.movies.ActorManager;


@Path("/movies")
public class Actors{
	@GET
	@Path("/actors")
	@Produces(MediaType.APPLICATION_JSON)
	public String getActors() throws Exception {
		ActorManager actorManager= new ActorManager();
		ArrayList actorsData = null;

		actorsData = actorManager.getActors();
		Gson gson = new Gson();
		String messages = gson.toJson(actorsData);
		return ("{\"Actors\":"+messages+"}");		
	}
	
	@GET
	@Path("/actors/{actor_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getActor(@PathParam("actor_id") String actorId) throws Exception {
		ActorManager actorManager= new ActorManager();
		Actor actorData = null;
		actorData = actorManager.getActor(actorId);
		Gson gson = new Gson();
		String actor = gson.toJson(actorData);
		return actor;		
	}
}