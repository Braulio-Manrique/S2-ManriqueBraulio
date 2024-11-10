package pe.com.braulio.S2_ManriqueBraulio.wsSoap.EndPoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.com.braulio.S2_ManriqueBraulio.wsSoap.Service.MedicoService;
import pe.com.braulio.ws.objects.GetListMedicoResponse;
import pe.com.braulio.ws.objects.GetMedicoRequest;
import pe.com.braulio.ws.objects.GetMedicoResponse;
import pe.com.braulio.ws.objects.PostMedicoResponse;

@Endpoint
public class MedicoEndpoint {
    private  static final  String NAMESPACE_UPI = "http://www.braulio.com.pe/ws/objects";

    @Autowired
    private MedicoService medicoService;

    @PayloadRoot(namespace = NAMESPACE_UPI, localPart = "getListMedicoRequest")
    @ResponsePayload
    public GetListMedicoResponse getListMedico(){
        return medicoService.obtnerMedico();
    }

    @PayloadRoot(namespace = NAMESPACE_UPI, localPart = "getMedicoRequest")
    @ResponsePayload
    public GetMedicoResponse obtnerMedico(@RequestPayload GetMedicoRequest request){
        return medicoService.obtnerMedico(request.getId());
    }
    @PayloadRoot(namespace = NAMESPACE_UPI, localPart = "postMedicoRequest")
    @ResponsePayload
    public PostMedicoResponse guardarMedico(@RequestPayload PostMedicoResponse request){
        return  medicoService.guardarMedico(request);
    }
}
