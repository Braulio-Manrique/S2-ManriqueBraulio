//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.11.10 a las 10:39:36 AM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="medico" type="{http://www.cibertec.edu.pe/ws/objects}medicossoap"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "medico"
})
@XmlRootElement(name = "postMedicoRequest")
public class PostMedicoRequest {

    @XmlElement(required = true)
    protected Medicossoap medico;

    /**
     * Obtiene el valor de la propiedad medico.
     * 
     * @return
     *     possible object is
     *     {@link Medicossoap }
     *     
     */
    public Medicossoap getMedico() {
        return medico;
    }

    /**
     * Define el valor de la propiedad medico.
     * 
     * @param value
     *     allowed object is
     *     {@link Medicossoap }
     *     
     */
    public void setMedico(Medicossoap value) {
        this.medico = value;
    }

}
