
package servis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pitanje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pitanje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idKviz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="odgovor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="slika" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="tacanOdgovor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pitanje", propOrder = {
    "id",
    "idKviz",
    "odgovor",
    "slika",
    "tacanOdgovor"
})
public class Pitanje {

    protected int id;
    protected int idKviz;
    protected int odgovor;
    protected byte[] slika;
    protected int tacanOdgovor;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the idKviz property.
     * 
     */
    public int getIdKviz() {
        return idKviz;
    }

    /**
     * Sets the value of the idKviz property.
     * 
     */
    public void setIdKviz(int value) {
        this.idKviz = value;
    }

    /**
     * Gets the value of the odgovor property.
     * 
     */
    public int getOdgovor() {
        return odgovor;
    }

    /**
     * Sets the value of the odgovor property.
     * 
     */
    public void setOdgovor(int value) {
        this.odgovor = value;
    }

    /**
     * Gets the value of the slika property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSlika() {
        return slika;
    }

    /**
     * Sets the value of the slika property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSlika(byte[] value) {
        this.slika = value;
    }

    /**
     * Gets the value of the tacanOdgovor property.
     * 
     */
    public int getTacanOdgovor() {
        return tacanOdgovor;
    }

    /**
     * Sets the value of the tacanOdgovor property.
     * 
     */
    public void setTacanOdgovor(int value) {
        this.tacanOdgovor = value;
    }

}
