package pe.com.braulio.S2_ManriqueBraulio.wsSoap.Service;


import pe.com.braulio.S2_ManriqueBraulio.wsSoap.model.bd.Medico;
import pe.com.braulio.ws.objects.GetListMedicoResponse;
import pe.com.braulio.ws.objects.GetMedicoResponse;
import pe.com.braulio.ws.objects.PostMedicoResponse;

public interface IMedicoService {
    GetListMedicoResponse obtnerMedico();

    GetListMedicoResponse obtenermedicos();
    GetMedicoResponse obtnerMedico(int id) ;
    PostMedicoResponse obtnermedico(PostMedicoResponse medico) ;

    PostMedicoResponse guardarMedico(PostMedicoResponse medico);

    Medico obtnerMedico(Medico medico);
}
