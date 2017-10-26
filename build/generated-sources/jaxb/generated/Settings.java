//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: PM.10.25 a las 08:37:24 PM CEST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="option" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dificultad" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="modeloNave" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="modeloLuna" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "option"
})
@XmlRootElement(name = "settings")
public class Settings {

    protected List<Settings.Option> option;

    /**
     * Gets the value of the option property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Settings.Option }
     * 
     * 
     */
    public List<Settings.Option> getOption() {
        if (option == null) {
            option = new ArrayList<Settings.Option>();
        }
        return this.option;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dificultad" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="modeloNave" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="modeloLuna" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "nombre",
        "dificultad",
        "modeloNave",
        "modeloLuna"
    })
    public static class Option {

        protected byte id;
        @XmlElement(required = true)
        protected String nombre;
        protected byte dificultad;
        protected byte modeloNave;
        protected byte modeloLuna;

        
        /**
         * Obtiene el valor de la propiedad id.
         * 
         */
        public byte getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         */
        public void setId(byte value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad dificultad.
         * 
         */
        public byte getDificultad() {
            return dificultad;
        }

        /**
         * Define el valor de la propiedad dificultad.
         * 
         */
        public void setDificultad(byte value) {
            this.dificultad = value;
        }

        /**
         * Obtiene el valor de la propiedad modeloNave.
         * 
         */
        public byte getModeloNave() {
            return modeloNave;
        }

        /**
         * Define el valor de la propiedad modeloNave.
         * 
         */
        public void setModeloNave(byte value) {
            this.modeloNave = value;
        }

        /**
         * Obtiene el valor de la propiedad modeloLuna.
         * 
         */
        public byte getModeloLuna() {
            return modeloLuna;
        }

        /**
         * Define el valor de la propiedad modeloLuna.
         * 
         */
        public void setModeloLuna(byte value) {
            this.modeloLuna = value;
        }

    }

}
