package dao.movies;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.Database;
import dto.movies.FilmActor;
public class FilmActorDao extends Database{
	public ArrayList<FilmActor> getActors( String sql) throws Exception
	{
		ArrayList<FilmActor> filmActorData = new ArrayList<FilmActor>();
		try
		{
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				FilmActor filmActor = new FilmActor();
				filmActor.setActor_id(rs.getInt("actor_id"));
				filmActor.setFilm_id(rs.getInt("film_id"));
				filmActor.setLast_update(rs.getString("last_update"));
				filmActorData.add(filmActor);
			}
			return filmActorData;
		}
		catch(Exception e)
		{
			throw e;
		}
	}

}
