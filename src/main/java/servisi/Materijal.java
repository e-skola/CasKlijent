
package servisi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for materijal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materijal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lekcija" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="razred" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="slika" type="{http://servisi/}bufferedImage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "materijal", propOrder = {
    "id",
    "lekcija",
    "razred",
    "slika"
})
public class Materijal {

    protected int id;
    protected int lekcija;
    protected int razred;
    protected BufferedImage slika;

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
     * Gets the value of the lekcija property.
     * 
     */
    public int getLekcija() {
        return lekcija;
    }

    /**
     * Sets the value of the lekcija property.
     * 
     */
    public void setLekcija(int value) {
        this.lekcija = value;
    }

    /**
     * Gets the value of the razred property.
     * 
     */
    public int getRazred() {
        return razred;
    }

    /**
     * Sets the value of the razred property.
     * 
     */
    public void setRazred(int value) {
        this.razred = value;
    }

    /**
     * Gets the value of the slika property.
     * 
     * @return
     *     possible object is
     *     {@link BufferedImage }
     *     
     */
    public BufferedImage getSlika() {
        return slika;
    }

    /**
     * Sets the value of the slika property.
     * 
     * @param value
     *     allowed object is
     *     {@link BufferedImage }
     *     
     */
    public void setSlika(BufferedImage value) {
        this.slika = value;
    }

}
