package pe.com.braulio.S2_ManriqueBraulio.wsSoap.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class MedicoWsdlConfig {
    @Bean(name = "medicos")
    public DefaultWsdl11Definition medicoswsdl(XsdSchema medicoEsquema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("MedicoPort");
        wsdl11Definition.setLocationUri("/ws/medico");
        wsdl11Definition.setTargetNamespace("http://www.braulio.com.pe/ws/objects");
        wsdl11Definition.setSchema(medicoEsquema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema medicoEsquema(){
        return new SimpleXsdSchema(
                new ClassPathResource("xsd/Medico.xsd"));
    }
}
