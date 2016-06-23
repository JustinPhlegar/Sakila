package controls.movies;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import dto.movies.Film;
import model.movies.FilmModel;

@Path("/movies")
public class Films {
	@GET
	@Path("/films")
	@Produces(MediaType.APPLICATION_JSON)
	public String doGet() throws Exception {
		FilmModel filmManager= new FilmModel();
		ArrayList<Film> filmsData = null;
		filmsData = filmManager.getFilms();
		Gson gson = new Gson();
		String messages = gson.toJson(filmsData);
		return ("{\"Films\":"+messages+"}");
	}
}