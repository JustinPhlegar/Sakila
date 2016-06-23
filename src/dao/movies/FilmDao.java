package dao.movies;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.Database;
import dto.movies.Film;
public class FilmDao extends Database{
	public ArrayList<Film> getFilms(String sql) throws Exception
	{
		ArrayList<Film> filmData = new ArrayList<Film>();
		try
		{
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Film film = new Film();
				film.setFilm_id(rs.getInt("film_id"));
				film.setTitle(rs.getString("title"));
				film.setDescription(rs.getString("description"));
				film.setRelease_year(rs.getString("release_year"));
				film.setLanguage_id(rs.getInt("language_id"));
				film.setOriginal_language_id(rs.getInt("original_language_id"));
				film.setRental_duration(rs.getInt("rental_duration"));
				film.setRental_rate(rs.getInt("rental_rate"));
				film.setLength(rs.getInt("length"));
				film.setReplacement_cost(rs.getFloat("replacement_cost"));
				film.setRating(rs.getString("rating"));
				film.setSpecial_features(rs.getString("special_features"));
				film.setLast_update(rs.getString("last_update"));
				filmData.add(film);
			}
			return filmData;
		}
		catch(Exception e)
		{
			throw e;
		}
	}

}
