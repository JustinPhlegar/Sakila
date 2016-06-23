package dao.movies;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.Database;
import dto.movies.Language;
public class LanguageDao extends Database{
	public ArrayList<Language> getLanguages(String sql) throws Exception
	{
		ArrayList<Language> languageData = new ArrayList<Language>();
		try
		{
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Language language = new Language();
				language.setLanguage_id(rs.getInt("language_id"));
				language.setName(rs.getString("name"));
				language.setLast_update(rs.getString("last_update"));
				languageData.add(language);
			}
			return languageData;
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
	
	public Language getLanguage(String sql) throws Exception
	{
		
		try
		{
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			rs.first();
			Language language = new Language();
			language.setLanguage_id(rs.getInt("language_id"));
			language.setName(rs.getString("name"));
			language.setLast_update(rs.getString("last_update"));

			return language;
			
		}
		catch(Exception e)
		{
			throw e;
		}
	}
}
