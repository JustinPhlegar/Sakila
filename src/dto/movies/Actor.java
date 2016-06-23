package dto.movies;

public class Actor{
	private int actor_Id;
	private String first_name;
	private String last_name;
	private String last_update;

	public Actor(){}

	public int getActor_Id() {
		return actor_Id;
	}

	public void setActor_Id(int actor_Id) {
		this.actor_Id = actor_Id;
	}

	public String getFirst_Name() {
		return first_name;
	}

	public void setFirst_Name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_Name() {
		return last_name;
	}

	public void setLast_Name(String last_name) {
		this.last_name = last_name;
	}

	public String getLast_Update() {
		return last_update;
	}

	public void setLast_Update(String last_update) {
		this.last_update = last_update;
	}

	
}