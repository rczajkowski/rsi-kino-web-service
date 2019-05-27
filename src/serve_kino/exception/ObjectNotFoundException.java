package serve_kino.exception;

public class ObjectNotFoundException extends Exception {
	
	private String message;

	public ObjectNotFoundException(String s, String message) {
		super(s);
		this.message = message;
	}

	public ObjectNotFoundException(String brak_filmu_o_podanym_id) {
	}
}
