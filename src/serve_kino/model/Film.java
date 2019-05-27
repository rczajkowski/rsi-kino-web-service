package serve_kino.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Film implements Serializable {

	public Film(String name, String pathToImage, Set<Long> schedule, String director, List<String> cast) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.pathToImage = pathToImage;
		this.schedule = schedule;
		this.director = director;
		this.cast = cast;
	}

	private String id;

	private String name;

	private String pathToImage;

	private Set<Long> schedule;

	private String director;

	private List<String> cast;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPathToImage() {
		return pathToImage;
	}

	public void setPathToImage(String pathToImage) {
		this.pathToImage = pathToImage;
	}

	public Set<Long> getSchedule() {
		return schedule;
	}

	public void setSchedule(Set<Long> schedule) {
		this.schedule = schedule;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List<String> getCast() {
		return cast;
	}

	public void setCast(List<String> cast) {
		this.cast = cast;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
