package controls.movies;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import dto.movies.FilmActor;
import model.movies.FilmActorModel;


@Path("/movies")
public class FilmActors {
	@GET
	@Path("/filmActors")
	@Produces(MediaType.APPLICATION_JSON)
	public String doGet() throws Exception {
		FilmActorModel filmActorManager= new FilmActorModel();
		ArrayList<FilmActor> filmActorsData = null;
		filmActorsData = filmActorManager.getFilmActors();
		Gson gson = new Gson();
		String messages = gson.toJson(filmActorsData);
		return ("{\"FilmActors\":"+messages+"}");
	}
}