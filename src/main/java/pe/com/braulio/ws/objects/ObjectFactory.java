//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.11.10 a las 10:43:59 AM PET 
//


package pe.com.braulio.ws.objects;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.com.braulio.ws.objects package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.com.braulio.ws.objects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListMedicoRequest }
     * 
     */
    public GetListMedicoRequest createGetListMedicoRequest() {
        return new GetListMedicoRequest();
    }

    /**
     * Create an instance of {@link GetListMedicoResponse }
     * 
     */
    public GetListMedicoResponse createGetListMedicoResponse() {
        return new GetListMedicoResponse();
    }

    /**
     * Create an instance of {@link Medicossoap }
     * 
     */
    public Medicossoap createMedicossoap() {
        return new Medicossoap();
    }

    /**
     * Create an instance of {@link GetMedicoRequest }
     * 
     */
    public GetMedicoRequest createGetMedicoRequest() {
        return new GetMedicoRequest();
    }

    /**
     * Create an instance of {@link GetMedicoResponse }
     * 
     */
    public GetMedicoResponse createGetMedicoResponse() {
        return new GetMedicoResponse();
    }

    /**
     * Create an instance of {@link PostMedicoRequest }
     * 
     */
    public PostMedicoRequest createPostMedicoRequest() {
        return new PostMedicoRequest();
    }

    /**
     * Create an instance of {@link PostMedicoResponse }
     * 
     */
    public PostMedicoResponse createPostMedicoResponse() {
        return new PostMedicoResponse();
    }

}
