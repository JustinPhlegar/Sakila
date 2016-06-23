package model.movies;

import java.util.ArrayList;

import dao.movies.LanguageDao;
import dto.movies.Language;

public class LanguageModel {

	public ArrayList<Language> getLanguages() throws Exception {
		String sql = "SELECT language_id, name, last_update FROM sakila.language  ORDER BY language_id ASC";
		ArrayList<Language> messages = null;
		try {
			// Here you can validate before connecting DAO class, eg. User session condition 
			LanguageDao languageDao= new LanguageDao();
			messages=languageDao.getLanguages(sql);
		} 
		catch (Exception e) {
			throw e;
		}
		return messages;
	}
	

	public Language getLanguage(String language_id) throws Exception {
		
		String sql = "SELECT language_id, name, last_update FROM sakila.language WHERE language_id = " +  language_id + " ORDER BY language_id ASC";
		try {
			// Here you can validate before connecting DAO class, eg. User session condition 
			LanguageDao languageDao= new LanguageDao();
			 return languageDao.getLanguage(sql);
		} 
		catch (Exception e) {
			throw e;
		}
		
	}

}
