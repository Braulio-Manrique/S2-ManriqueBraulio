package pe.com.braulio.S2_ManriqueBraulio.wsSoap.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.com.braulio.S2_ManriqueBraulio.wsSoap.Repository.MedicoRepository;
import pe.com.braulio.S2_ManriqueBraulio.wsSoap.Util.Convert.MedicoConvert;
import pe.com.braulio.S2_ManriqueBraulio.wsSoap.model.bd.Medico;
import pe.com.braulio.ws.objects.GetListMedicoResponse;
import pe.com.braulio.ws.objects.GetMedicoResponse;
import pe.com.braulio.ws.objects.PostMedicoResponse;

@RequiredArgsConstructor
@Service
public class MedicoService  implements IMedicoService {
    private final MedicoRepository medicoRepository;;
    private final MedicoConvert medicoConvert;

    @Override
    public GetListMedicoResponse obtnerMedico() {

        GetListMedicoResponse response = new GetListMedicoResponse();
        response.getListmedicos().addAll(medicoConvert.convertDomiciliosoapList(medicoRepository.findAll()));

        return response;
    }

    @Override
    public GetListMedicoResponse obtenermedicos() {
        return null;
    }

    @Override
    public GetMedicoResponse obtnerMedico(int id) {
        GetMedicoResponse response = new GetMedicoResponse();
        Medico medico = medicoRepository.findById(id).orElse(null);
        if (medico != null) {
            response.setMedico(medicoConvert.convertDomiciliosoap(medico));
        }
        return  response;
    }

    @Override
    public PostMedicoResponse obtnermedico(PostMedicoResponse medicp) {
        return null;
    }

    @Override
    public PostMedicoResponse guardarMedico(PostMedicoResponse medico) {
        PostMedicoResponse response = new PostMedicoResponse();
        Medico nuevoMedico = medicoRepository.save(medicoConvert.convertDomicilioBD(medico.getMedico()));
        response.setMedico(medicoConvert.convertDomiciliosoap(nuevoMedico));
        return response;
    }

    @Override
    public Medico obtnerMedico(Medico medico) {
        return medicoRepository.save(medico);
    }
}

