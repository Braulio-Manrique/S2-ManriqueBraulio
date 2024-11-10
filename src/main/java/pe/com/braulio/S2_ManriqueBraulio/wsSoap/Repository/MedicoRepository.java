package pe.com.braulio.S2_ManriqueBraulio.wsSoap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.braulio.S2_ManriqueBraulio.wsSoap.model.bd.Medico;

@Repository
public interface MedicoRepository  extends JpaRepository<Medico, Integer> {
}
