
package serve_kino;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serve_kino package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObjectNotFoundException_QNAME = new QName("http://serve_kino/", "ObjectNotFoundException");
    private final static QName _GetAllUserReservations_QNAME = new QName("http://serve_kino/", "getAllUserReservations");
    private final static QName _GetAllUserReservationsResponse_QNAME = new QName("http://serve_kino/", "getAllUserReservationsResponse");
    private final static QName _GetAllFilmsResponse_QNAME = new QName("http://serve_kino/", "getAllFilmsResponse");
    private final static QName _GetImage_QNAME = new QName("http://serve_kino/", "getImage");
    private final static QName _ResignationResponse_QNAME = new QName("http://serve_kino/", "resignationResponse");
    private final static QName _GetAllFilms_QNAME = new QName("http://serve_kino/", "getAllFilms");
    private final static QName _GetImageResponse_QNAME = new QName("http://serve_kino/", "getImageResponse");
    private final static QName _UpdateReservationResponse_QNAME = new QName("http://serve_kino/", "updateReservationResponse");
    private final static QName _UpdateReservation_QNAME = new QName("http://serve_kino/", "updateReservation");
    private final static QName _MakeReseravationResponse_QNAME = new QName("http://serve_kino/", "makeReseravationResponse");
    private final static QName _Resignation_QNAME = new QName("http://serve_kino/", "resignation");
    private final static QName _MakeReseravation_QNAME = new QName("http://serve_kino/", "makeReseravation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serve_kino
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllFilms }
     * 
     */
    public GetAllFilms createGetAllFilms() {
        return new GetAllFilms();
    }

    /**
     * Create an instance of {@link GetImageResponse }
     * 
     */
    public GetImageResponse createGetImageResponse() {
        return new GetImageResponse();
    }

    /**
     * Create an instance of {@link ResignationResponse }
     * 
     */
    public ResignationResponse createResignationResponse() {
        return new ResignationResponse();
    }

    /**
     * Create an instance of {@link UpdateReservationResponse }
     * 
     */
    public UpdateReservationResponse createUpdateReservationResponse() {
        return new UpdateReservationResponse();
    }

    /**
     * Create an instance of {@link UpdateReservation }
     * 
     */
    public UpdateReservation createUpdateReservation() {
        return new UpdateReservation();
    }

    /**
     * Create an instance of {@link MakeReseravationResponse }
     * 
     */
    public MakeReseravationResponse createMakeReseravationResponse() {
        return new MakeReseravationResponse();
    }

    /**
     * Create an instance of {@link Resignation }
     * 
     */
    public Resignation createResignation() {
        return new Resignation();
    }

    /**
     * Create an instance of {@link MakeReseravation }
     * 
     */
    public MakeReseravation createMakeReseravation() {
        return new MakeReseravation();
    }

    /**
     * Create an instance of {@link GetAllUserReservations }
     * 
     */
    public GetAllUserReservations createGetAllUserReservations() {
        return new GetAllUserReservations();
    }

    /**
     * Create an instance of {@link ObjectNotFoundException }
     * 
     */
    public ObjectNotFoundException createObjectNotFoundException() {
        return new ObjectNotFoundException();
    }

    /**
     * Create an instance of {@link GetAllUserReservationsResponse }
     * 
     */
    public GetAllUserReservationsResponse createGetAllUserReservationsResponse() {
        return new GetAllUserReservationsResponse();
    }

    /**
     * Create an instance of {@link GetAllFilmsResponse }
     * 
     */
    public GetAllFilmsResponse createGetAllFilmsResponse() {
        return new GetAllFilmsResponse();
    }

    /**
     * Create an instance of {@link GetImage }
     * 
     */
    public GetImage createGetImage() {
        return new GetImage();
    }

    /**
     * Create an instance of {@link LocalDateTime }
     * 
     */
    public LocalDateTime createLocalDateTime() {
        return new LocalDateTime();
    }

    /**
     * Create an instance of {@link Film }
     * 
     */
    public Film createFilm() {
        return new Film();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve_kino/", name = "ObjectNotFoundException")
    public JAXBElement<ObjectNotFoundException> createObjectNotFoundException(ObjectNotFoundException value) {
        return new JAXBElement<ObjectNotFoundException>(_ObjectNotFoundException_QNAME, ObjectNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUserReservations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve_kino/", name = "getAllUserReservations")
    public JAXBElement<GetAllUserReservations> createGetAllUserReservations(GetAllUserReservations value) {
        return new JAXBElement<GetAllUserReservations>(_GetAllUserReservations_QNAME, GetAllUserReservations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUserReservationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve_kino/", name = "getAllUserReservationsResponse")
    public JAXBElement<GetAllUserReservationsResponse> createGetAllUserReservationsResponse(GetAllUserReservationsResponse value) {
        return new JAXBElement<GetAllUserReservationsResponse>(_GetAllUserReservationsResponse_QNAME, GetAllUserReservationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFilmsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve_kino/", name = "getAllFilmsResponse")
    public JAXBElement<GetAllFilmsResponse> createGetAllFilmsResponse(GetAllFilmsResponse value) {
        return new JAXBElement<GetAllFilmsResponse>(_GetAllFilmsResponse_QNAME, GetAllFilmsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve_kino/", name = "getImage")
    public JAXBElement<GetImage> createGetImage(GetImage value) {
        return new JAXBElement<GetImage>(_GetImage_QNAME, GetImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResignationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve_kino/", name = "resignationResponse")
    public JAXBElement<ResignationResponse> createResignationResponse(ResignationResponse value) {
        return new JAXBElement<ResignationResponse>(_ResignationResponse_QNAME, ResignationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFilms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve_kino/", name = "getAllFilms")
    public JAXBElement<GetAllFilms> createGetAllFilms(GetAllFilms value) {
        return new JAXBElement<GetAllFilms>(_GetAllFilms_QNAME, GetAllFilms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve_kino/", name = "getImageResponse")
    public JAXBElement<GetImageResponse> createGetImageResponse(GetImageResponse value) {
        return new JAXBElement<GetImageResponse>(_GetImageResponse_QNAME, GetImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve_kino/", name = "updateReservationResponse")
    public JAXBElement<UpdateReservationResponse> createUpdateReservationResponse(UpdateReservationResponse value) {
        return new JAXBElement<UpdateReservationResponse>(_UpdateReservationResponse_QNAME, UpdateReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve_kino/", name = "updateReservation")
    public JAXBElement<UpdateReservation> createUpdateReservation(UpdateReservation value) {
        return new JAXBElement<UpdateReservation>(_UpdateReservation_QNAME, UpdateReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeReseravationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve_kino/", name = "makeReseravationResponse")
    public JAXBElement<MakeReseravationResponse> createMakeReseravationResponse(MakeReseravationResponse value) {
        return new JAXBElement<MakeReseravationResponse>(_MakeReseravationResponse_QNAME, MakeReseravationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resignation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve_kino/", name = "resignation")
    public JAXBElement<Resignation> createResignation(Resignation value) {
        return new JAXBElement<Resignation>(_Resignation_QNAME, Resignation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeReseravation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serve_kino/", name = "makeReseravation")
    public JAXBElement<MakeReseravation> createMakeReseravation(MakeReseravation value) {
        return new JAXBElement<MakeReseravation>(_MakeReseravation_QNAME, MakeReseravation.class, null, value);
    }

}
