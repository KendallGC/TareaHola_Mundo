
package WS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Calculadora complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Calculadora">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dato2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="con" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Calculadora", propOrder = {
    "dato",
    "dato2",
    "con"
})
public class Calculadora_Type {

    protected int dato;
    protected int dato2;
    protected int con;

    /**
     * Obtiene el valor de la propiedad dato.
     * 
     */
    public int getDato() {
        return dato;
    }

    /**
     * Define el valor de la propiedad dato.
     * 
     */
    public void setDato(int value) {
        this.dato = value;
    }

    /**
     * Obtiene el valor de la propiedad dato2.
     * 
     */
    public int getDato2() {
        return dato2;
    }

    /**
     * Define el valor de la propiedad dato2.
     * 
     */
    public void setDato2(int value) {
        this.dato2 = value;
    }

    /**
     * Obtiene el valor de la propiedad con.
     * 
     */
    public int getCon() {
        return con;
    }

    /**
     * Define el valor de la propiedad con.
     * 
     */
    public void setCon(int value) {
        this.con = value;
    }

}
