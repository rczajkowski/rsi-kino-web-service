package serve_kino;

import java.io.IOException;
import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) throws IOException {
		Endpoint.publish("http://localhost:8081/ws/serve_kino", new Kino());
		System.out.println("Web service running");
	}
}
