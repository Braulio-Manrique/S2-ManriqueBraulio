package pe.com.braulio.S2_ManriqueBraulio.wsSoap.Util.Convert;

import org.springframework.stereotype.Component;
import pe.com.braulio.S2_ManriqueBraulio.wsSoap.model.bd.Medico;
import pe.com.braulio.ws.objects.Medicossoap;

import java.util.ArrayList;
import java.util.List;

@Component
public class MedicoConvert {
    public Medico convertDomicilioBD(Medicossoap medicoSoap){
        Medico medico = new Medico();
        medico.setIdmedico(medicoSoap.getId());
        medico.setNommedico(medicoSoap.getNombre());
        medico.setApemedico(medicoSoap.getApellido());
        medico.setFechnacmedico(medicoSoap.getFecha());
        return medico;
    }
    public Medicossoap convertDomiciliosoap(Medico medico){
        Medicossoap medicossoap = new Medicossoap();
        medicossoap.setId(medico.getIdmedico());
        medicossoap.setNombre(medico.getNommedico());
        medicossoap.setApellido(medico.getApemedico());
        medicossoap.setFecha(medico.getFechnacmedico());
        return medicossoap;
    }
    public List<Medico> convertDomicilioBDList(List<Medicossoap> medicossoaps){
        List<Medico> medicos = new ArrayList<Medico>();
        for (Medicossoap medico : medicossoaps) {
            medicos.add(convertDomicilioBD(medico));
        }
        return medicos;
    }
    public List<Medicossoap> convertDomiciliosoapList(List<Medico> medicos){
        List<Medicossoap> medicossoaps = new ArrayList<Medicossoap>();
        for (Medico medico : medicos) {
            medicossoaps.add(convertDomiciliosoap(medico));
        }
        return medicossoaps;
    }
}
