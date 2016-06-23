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
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import dao.Database;
import model.movies.FilmActorManager;


@Path("/movies")
public class FilmActors {
	@GET
	@Path("/filmActors")
	@Produces(MediaType.APPLICATION_JSON)
	public String doGet() throws Exception {
		FilmActorManager filmActorManager= new FilmActorManager();
		ArrayList filmActorsData = null;
		filmActorsData = filmActorManager.getFilmActors();
		Gson gson = new Gson();
		String messages = gson.toJson(filmActorsData);
		return ("{\"FilmActors\":"+messages+"}");
	}
}