package dao.movies;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.Database;
import dto.movies.Actor;
public class ActorDao extends Database{
	public ArrayList<Actor> getActors( String sql) throws Exception
	{
		ArrayList<Actor> actorData = new ArrayList<Actor>();
		try
		{
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Actor actor = new Actor();
				actor.setActor_Id(rs.getInt("actor_Id"));
				actor.setFirst_Name(rs.getString("first_name"));
				actor.setLast_Name(rs.getString("last_name"));
				actor.setLast_Update(rs.getString("last_update"));
				actorData.add(actor);
			}
			return actorData;
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
	public Actor getActor(String sql) throws Exception
	{
		try
		{
			PreparedStatement ps =  getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Actor actor = new Actor();
			while(rs.next())
			{
				
				actor.setActor_Id(rs.getInt("actor_Id"));
				actor.setFirst_Name(rs.getString("first_name"));
				actor.setLast_Name(rs.getString("last_name"));
				actor.setLast_Update(rs.getString("last_update"));
			}
			return actor;
		}
		catch(Exception e)
		{
			throw e;
		}
	}

}
