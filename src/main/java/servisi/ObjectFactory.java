
package servisi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servisi package. 
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

    private final static QName _PreuzmiMaterijalResponse_QNAME = new QName("http://servisi/", "preuzmiMaterijalResponse");
    private final static QName _PreuzmiMaterijale_QNAME = new QName("http://servisi/", "preuzmiMaterijale");
    private final static QName _PreuzmiMaterijal_QNAME = new QName("http://servisi/", "preuzmiMaterijal");
    private final static QName _PreuzmiMaterijaleResponse_QNAME = new QName("http://servisi/", "preuzmiMaterijaleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servisi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PreuzmiMaterijalResponse }
     * 
     */
    public PreuzmiMaterijalResponse createPreuzmiMaterijalResponse() {
        return new PreuzmiMaterijalResponse();
    }

    /**
     * Create an instance of {@link PreuzmiMaterijal }
     * 
     */
    public PreuzmiMaterijal createPreuzmiMaterijal() {
        return new PreuzmiMaterijal();
    }

    /**
     * Create an instance of {@link PreuzmiMaterijale }
     * 
     */
    public PreuzmiMaterijale createPreuzmiMaterijale() {
        return new PreuzmiMaterijale();
    }

    /**
     * Create an instance of {@link PreuzmiMaterijaleResponse }
     * 
     */
    public PreuzmiMaterijaleResponse createPreuzmiMaterijaleResponse() {
        return new PreuzmiMaterijaleResponse();
    }

    /**
     * Create an instance of {@link Materijal }
     * 
     */
    public Materijal createMaterijal() {
        return new Materijal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreuzmiMaterijalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servisi/", name = "preuzmiMaterijalResponse")
    public JAXBElement<PreuzmiMaterijalResponse> createPreuzmiMaterijalResponse(PreuzmiMaterijalResponse value) {
        return new JAXBElement<PreuzmiMaterijalResponse>(_PreuzmiMaterijalResponse_QNAME, PreuzmiMaterijalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreuzmiMaterijale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servisi/", name = "preuzmiMaterijale")
    public JAXBElement<PreuzmiMaterijale> createPreuzmiMaterijale(PreuzmiMaterijale value) {
        return new JAXBElement<PreuzmiMaterijale>(_PreuzmiMaterijale_QNAME, PreuzmiMaterijale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreuzmiMaterijal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servisi/", name = "preuzmiMaterijal")
    public JAXBElement<PreuzmiMaterijal> createPreuzmiMaterijal(PreuzmiMaterijal value) {
        return new JAXBElement<PreuzmiMaterijal>(_PreuzmiMaterijal_QNAME, PreuzmiMaterijal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreuzmiMaterijaleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servisi/", name = "preuzmiMaterijaleResponse")
    public JAXBElement<PreuzmiMaterijaleResponse> createPreuzmiMaterijaleResponse(PreuzmiMaterijaleResponse value) {
        return new JAXBElement<PreuzmiMaterijaleResponse>(_PreuzmiMaterijaleResponse_QNAME, PreuzmiMaterijaleResponse.class, null, value);
    }

}
