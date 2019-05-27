package serve_kino.pdf_service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Instant;
import java.time.ZoneId;
import serve_kino.model.Reservation;

public class PdfService {

	private static final String PATH = "/home/rafau/IdeaProjects/rsi/ps6/auth/client/src/main/resources";

	public void generateReservationPdf(Reservation reservation) throws DocumentException, FileNotFoundException {

		Document document = new Document();
		// step 2
		PdfWriter.getInstance(document, new FileOutputStream(PATH + "/reservation-" + reservation.getId()+".pdf"));
		// step 3
		document.open();
		// step 4
		document.add(new Paragraph("Rezerwacja na film: " + reservation.getFilm().getName()));
		document.add(new Paragraph("Godzina: " + Instant
				.ofEpochMilli(reservation.getDate()).atZone(ZoneId.of("Europe/Warsaw")).toLocalDateTime().toString()));
		document.add(new Paragraph("Miejsca: " + reservation.getSeatsNo()));

		// step 5
		document.close();

	}

}
