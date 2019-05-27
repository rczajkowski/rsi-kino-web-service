package serve_kino.model;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Reservation implements Serializable {


	public Reservation(String name, Film film, List<Integer> seatsNo) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.film = film;
		this.seatsNo = seatsNo;
		this.resignationToken = UUID.randomUUID().toString();
	}
	private String id;

	private String userId;

	private String name;

	private Film film;

	private List<Integer> seatsNo;

	private String resignationToken;

	private long date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public List<Integer> getSeatsNo() {
		return seatsNo;
	}

	public void setSeatsNo(List<Integer> seatsNo) {
		this.seatsNo = seatsNo;
	}

	public String getResignationToken() {
		return resignationToken;
	}

	public void setResignationToken(String resignationToken) {
		this.resignationToken = resignationToken;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
