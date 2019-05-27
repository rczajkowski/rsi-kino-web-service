/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serve_kino;

import com.itextpdf.text.DocumentException;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.imageio.ImageIO;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlMimeType;
import serve_kino.exception.ObjectNotFoundException;
import serve_kino.model.Film;
import serve_kino.model.Reservation;
import serve_kino.pdf_service.PdfService;

/**
 *
 * @author Tomek
 */
@WebService
public class Kino {

    PdfService pdfService = new PdfService();

    List<Film> films = new ArrayList<>();
    List<Reservation> reservations = new ArrayList<>();
    Map<String, Image> photo = new HashMap<>();

    List<String> filmy = new ArrayList<String>();

    List<Image> zdjecia = new ArrayList<Image>();
    boolean[][] rezerwacja = new boolean[24][100];

    public Kino() throws IOException {
        Film film = new Film("Nowy film", "/home/rafau/IdeaProjects/RSI/photo/avengers1.png",
                Stream.of(LocalDateTime.of(2019, Month.MAY, 20, 11, 15).atZone(ZoneId.of("Europe/Warsaw")).toInstant().toEpochMilli(), LocalDateTime.of(2019, Month.MAY, 22, 21, 33).atZone(ZoneId.of("Europe/Warsaw")).toInstant().toEpochMilli())
                        .collect(Collectors.toSet()), "Andrzej Wajda", Arrays.asList("AAAA", "BBB"));
        films.add(film);
        photo.put(film.getId(), ImageIO.read(new File(film.getPathToImage())));
        System.out.println(film.getId());
    }

    @WebMethod(action = "getAllFilms")
    public List<Film> getAllFilms() {
        return films;
    }

    @WebMethod(action = "getImage")
    public
    @XmlMimeType("image/jpeg")
    Image getImage(String filmId) throws ObjectNotFoundException {
       return photo.get(filmId);
    }

    @WebMethod(action = "makeReseravation")
    public String makeReseravation(String userID, List<Integer> seats, String filmId, Long date)
            throws FileNotFoundException, DocumentException {
        Film film = films.stream()
                .filter(film1 -> film1.getId().equals(filmId))
                .findFirst()
                .orElse(null);
        if(film == null)
            return "Nie ma takiego filmu";
        if (seats.stream().anyMatch(m -> m > 100 && m < 1)) {
            return "Wprowadźmiejsce miejsce poprawnie";
        }
        if (film.getSchedule().stream().noneMatch(s -> s.equals(date))) {
            return "Bledna data";
        }

        Reservation checkRes = reservations.stream()
                .filter(r -> r.getFilm().getId().equals(filmId) && r.getDate() == date && seats.stream().anyMatch(m -> r.getSeatsNo().contains(m)))
                .findFirst()
                .orElse(null);
        if (checkRes != null) {
            return "Miejsce na film " + film.getName() + " o godzinie " +  Instant
                    .ofEpochMilli(date).atZone(ZoneId.of("Europe/Warsaw")).toLocalDateTime().toString() +  " o numerze " + checkRes.getSeatsNo().stream().filter(seats::contains).findFirst().orElse(0) + " jest już zajęte";
        }

        Reservation reservation = new Reservation(film.getName(), film, seats);
        reservation.setDate(date);
        reservations.add(reservation);
        reservation.setUserId(userID);
        pdfService.generateReservationPdf(reservation);
        System.out.println("Rezerwacja mijesc o numerze: " + reservation.getSeatsNo()  + " na film pt: " + film.getName() + " o  godz " + date);
        return "Dokonales rezerwacji miejsca " + reservation.getSeatsNo() + " na film " + film.getName() + " o godzinie " + Instant
                .ofEpochMilli(date).atZone(ZoneId.of("Europe/Warsaw")).toLocalDateTime().toString();

    }

    @WebMethod(action = "resignation")
    public String resignation(String resignationToken) throws ObjectNotFoundException {
        Reservation reservation = reservations.stream().filter(r -> r.getResignationToken().equals(resignationToken)).findFirst().orElseThrow(() -> new ObjectNotFoundException("Nie znaleziono podanej rezerwacji"));
        reservations.remove(reservation);
        return "Zrezygnowales z rezerwacji miejsca " + reservation.getSeatsNo() + " na film " + reservation.getFilm().getName() + " o godzienie " +
                Instant
                        .ofEpochMilli(reservation.getDate()).atZone(ZoneId.of("Europe/Warsaw")).toLocalDateTime().toString();
    }

    @WebMethod(action = "updateReservation")
    public String updateReservation(String reservationId, List<Integer> seats)
            throws ObjectNotFoundException, FileNotFoundException, DocumentException {
        Reservation reservation = reservations.stream().filter(r -> r.getId().equals(reservationId)).findFirst().orElseThrow(() -> new ObjectNotFoundException("Nie znaleziono podanej rezerwacji"));

        if (seats.stream().anyMatch(m -> m > 100 && m < 1)) {
            return "Wprowadź miejsce miejsce poprawnie";
        }

        Reservation checkRes = reservations.stream()
                .filter(r -> r.getFilm().getId().equals(reservation.getFilm().getId()) && r.getDate() == reservation.getDate() && seats.stream().anyMatch(m -> r.getSeatsNo().contains(m)) && !reservation.getId().equals(r.getId()))
                .findFirst()
                .orElse(null);
        if (checkRes != null) {
            return "Miejsce na film " + reservation.getFilm().getName() + " o godzinie " + reservation.getDate() +  " o numerze " + checkRes.getSeatsNo() + " jest już zajęte";
        }

        reservations.remove(reservation);
        reservation.setSeatsNo(seats);
        reservations.add(reservation);
        pdfService.generateReservationPdf(reservation);

        return "Zaktualizowano rezerwację pomyślnie";
    }

    @WebMethod(action = "getAllUserReservations")
    public List<Reservation> getAllUserReservations(String userId) {
        return reservations.stream().filter(r -> r.getUserId().equals(userId)).collect(Collectors.toList());

    }
}
