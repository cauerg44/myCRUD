package entities;

import java.io.Serializable;
import java.util.Objects;

public class Library implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String session;
	private Integer year_of_publication;
	
	public Library() {
	}
	
	public Library(Integer id, String name, String session, Integer year_of_publication) {
		this.id = id;
		this.name = name;
		this.session = session;
		this.year_of_publication = year_of_publication;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public Integer getYear_of_publication() {
		return year_of_publication;
	}

	public void setYear_of_publication(Integer year_of_publication) {
		this.year_of_publication = year_of_publication;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Id: " + id + "\n");
		sb.append("Name: " + name + "\n");
		sb.append("Session: " + session + "\n");
		sb.append("Year published: " + year_of_publication + "\n");
		return sb.toString();
	}
}
