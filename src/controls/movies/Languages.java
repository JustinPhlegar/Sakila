package controls.movies;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import dto.movies.Language;
import model.movies.LanguageModel;


@Path("/movies")
public class Languages{
	@GET
	@Path("/languages")
	@Produces(MediaType.APPLICATION_JSON)
	public String getLanguages() throws Exception {
		LanguageModel languageManager= new LanguageModel();
		ArrayList<Language> languagesData = null;
		languagesData = languageManager.getLanguages();
		Gson gson = new Gson();
		String messages = gson.toJson(languagesData);
		return ("{\"Languages\":"+messages+"}");		
	}
	
	@GET
	@Path("/languages/{language_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getLanguage(@PathParam("language_id") String languageId) throws Exception {
		LanguageModel languageManager= new LanguageModel();
		Language languagesData = null;
		languagesData = languageManager.getLanguage(languageId);
		Gson gson = new Gson();
		String language = gson.toJson(languagesData);
		return language;		
	}
}